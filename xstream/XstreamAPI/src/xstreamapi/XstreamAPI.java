/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xstreamapi;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author jconner
 */
public class XstreamAPI {

    public static void main(String[] args) {

        try {
            URL xmlURL = new URL("http://www.reddit.com/user/"+ args[0] +"/submitted/.xml");
            InputStream is = xmlURL.openStream();
            JAXBContext jaxbContext = JAXBContext.newInstance(RssBean.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            RssBean post = (RssBean) jaxbUnmarshaller.unmarshal(is);
            
            Iterator<ItemBean> it = post.getChannel().getItem().iterator();
            while(it.hasNext()) {
                System.out.println(it.next().getCategory());
            }

        } catch (JAXBException ex) {
            Logger.getLogger(XstreamAPI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(XstreamAPI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(XstreamAPI.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
