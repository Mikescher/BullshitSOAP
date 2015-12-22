package de.samdev.bullshitsoap.comunioWebService.messages;

import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Elements;

/****************************************************************************** 
 *                                                                            * 
 *           THIS CODE WAS CREATED BY BULLSHITSOAP - DO NOT CHANGE            * 
 *                                                                            * 
 ******************************************************************************/

public abstract class WSDLMessage {
    protected final String namespace;
    
    protected WSDLMessage(String ns) {
        namespace = ns;
    }
    
    protected static Element getFirstChildrenIgnoreNamespace(Element parent, String tag) {
        Elements children = parent.getChildElements();
        for (int i = 0; i < children.size(); i++) {
            if (children.get(i).getLocalName().equals(tag)) return children.get(i);
        }
        
        return null;
    }
    
    public abstract Document serialize(String opname);
}