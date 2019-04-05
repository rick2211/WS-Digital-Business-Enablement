
/**
 * DisciplinaBOCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package br.com.fiap.bo;

    /**
     *  DisciplinaBOCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class DisciplinaBOCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public DisciplinaBOCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public DisciplinaBOCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for calcularMedia method
            * override this method for handling normal response from calcularMedia operation
            */
           public void receiveResultcalcularMedia(
                    br.com.fiap.bo.DisciplinaBOStub.CalcularMediaResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from calcularMedia operation
           */
            public void receiveErrorcalcularMedia(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for calcularNotaExame method
            * override this method for handling normal response from calcularNotaExame operation
            */
           public void receiveResultcalcularNotaExame(
                    br.com.fiap.bo.DisciplinaBOStub.CalcularNotaExameResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from calcularNotaExame operation
           */
            public void receiveErrorcalcularNotaExame(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for retidoFalta method
            * override this method for handling normal response from retidoFalta operation
            */
           public void receiveResultretidoFalta(
                    br.com.fiap.bo.DisciplinaBOStub.RetidoFaltaResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from retidoFalta operation
           */
            public void receiveErrorretidoFalta(java.lang.Exception e) {
            }
                


    }
    