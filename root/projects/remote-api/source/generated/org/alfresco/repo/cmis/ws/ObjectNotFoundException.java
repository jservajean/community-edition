
package org.alfresco.repo.cmis.ws;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.1.2
 * Fri Sep 05 13:45:08 EEST 2008
 * Generated source version: 2.1.2
 * 
 */

@WebFault(name = "objectNotFoundException", targetNamespace = "http://www.cmis.org/2008/05")
public class ObjectNotFoundException extends Exception {
    public static final long serialVersionUID = 20080905134508L;
    
    private org.alfresco.repo.cmis.ws.ObjectNotFoundExceptionType objectNotFoundException;

    public ObjectNotFoundException() {
        super();
    }
    
    public ObjectNotFoundException(String message) {
        super(message);
    }
    
    public ObjectNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public ObjectNotFoundException(String message, org.alfresco.repo.cmis.ws.ObjectNotFoundExceptionType objectNotFoundException) {
        super(message);
        this.objectNotFoundException = objectNotFoundException;
    }

    public ObjectNotFoundException(String message, org.alfresco.repo.cmis.ws.ObjectNotFoundExceptionType objectNotFoundException, Throwable cause) {
        super(message, cause);
        this.objectNotFoundException = objectNotFoundException;
    }

    public org.alfresco.repo.cmis.ws.ObjectNotFoundExceptionType getFaultInfo() {
        return this.objectNotFoundException;
    }
}
