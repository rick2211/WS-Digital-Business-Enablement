package br.com.fiap.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import br.com.fiap.dao.EmpresaDAO;
import br.com.fiap.dao.impl.EmpresaDAOImpl;
import br.com.fiap.entity.Empresa;
import br.com.fiap.exception.CodigoInvalidoException;
import br.com.fiap.exception.CommitException;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

@Path("/empresa")
public class EmpresaResource {

	private EmpresaDAO dao;
	public EmpresaResource() {
		dao = new EmpresaDAOImpl(EntityManagerFactorySingleton.getInstance().createEntityManager());
	}
	@DELETE
	@Path("{id}")
	public void delete(@PathParam("id") Integer codigo ) {
		try {
			dao.remover(codigo);
			dao.commit();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();	
		} 

	}

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("{id}")
	public Response atualizar(Empresa empresa, @PathParam("id") Integer codigo) {
		try {
			empresa.setCodigo(codigo);
			dao.alterar(empresa);
			dao.commit();
		}catch(CommitException e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
		return Response.ok().build();
	}

	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Empresa buscar(@PathParam("id") Integer codigo ) {
		try {
			return dao.buscar(codigo);
		} catch (CodigoInvalidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;


	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response cadastrar(Empresa empresa, @Context UriInfo url) {
		try {
			dao.cadastrar(empresa);
			dao.commit();
		}catch(CommitException e) {
			e.printStackTrace();
			return Response.serverError().build();
		}

		UriBuilder builder = url.getAbsolutePathBuilder();
		builder.path(String.valueOf(empresa.getCodigo()));
		return Response.created(builder.build()).build();
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Empresa> buscar() {
		return dao.listar();
	}

}
