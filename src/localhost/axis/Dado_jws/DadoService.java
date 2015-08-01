/**
 * DadoService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.axis.Dado_jws;

public interface DadoService extends javax.xml.rpc.Service {
    public java.lang.String getDadoAddress();

    public localhost.axis.Dado_jws.Dado getDado() throws javax.xml.rpc.ServiceException;

    public localhost.axis.Dado_jws.Dado getDado(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
