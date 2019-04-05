package br.com.fiap.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.InternalServerErrorException;
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

	// DELETE rest/empresa/1
	@DELETE
	@Path("{id}")
	public void remover(@PathParam("id") int codigo) {

		try {
			dao.remover(codigo);
			dao.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new InternalServerErrorException(); //500
			//return Response.serverError().build();
		}
		//return Response.noContent().build(); //204
	}

	// PUT rest/empresa/1
	@PUT
	@Path("{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response atualizar(Empresa empresa, @PathParam("id") int codigo) {

		try {
			empresa.setCodigo(codigo);
			dao.alterar(empresa);
			dao.commit();
		} catch (CommitException e) {
			e.printStackTrace();
			return Response.serverError().build();// 500
		}

		return Response.ok().build(); // 20OK
	}

	// GET rest/empresa/1
	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Empresa busca(@PathParam("id") int codigo) {
		try {
			return dao.buscar(codigo);
		} catch (CodigoInvalidoException e) {
			e.printStackTrace();
			return null;
		}
	}

	// http://localhost:8080/12-WS-Restful/rest/empresa/

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response cadastrar(Empresa empresa, @Context UriInfo url) {

		try {
			dao.cadastrar(empresa);
			dao.commit();
		} catch (CommitException e) {
			e.printStackTrace();
			return Response.serverError().build(); // 500
		}
		// Criar a URL para acessar a empresa cadastrada
		UriBuilder builder = url.getAbsolutePathBuilder();
		builder.path(String.valueOf(empresa.getCodigo()));

		// HTTP Status Code : 201 Created
		return Response.created(builder.build()).build();
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Empresa> buscar() {
		return dao.listar();
	}

}
