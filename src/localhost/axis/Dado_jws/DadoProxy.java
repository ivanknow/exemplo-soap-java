package localhost.axis.Dado_jws;

public class DadoProxy implements localhost.axis.Dado_jws.Dado {
  private String _endpoint = null;
  private localhost.axis.Dado_jws.Dado dado = null;
  
  public DadoProxy() {
    _initDadoProxy();
  }
  
  public DadoProxy(String endpoint) {
    _endpoint = endpoint;
    _initDadoProxy();
  }
  
  private void _initDadoProxy() {
    try {
      dado = (new localhost.axis.Dado_jws.DadoServiceLocator()).getDado();
      if (dado != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)dado)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)dado)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (dado != null)
      ((javax.xml.rpc.Stub)dado)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public localhost.axis.Dado_jws.Dado getDado() {
    if (dado == null)
      _initDadoProxy();
    return dado;
  }
  
  public int cacular(int faces) throws java.rmi.RemoteException{
    if (dado == null)
      _initDadoProxy();
    return dado.cacular(faces);
  }
  
  
}