/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package xstreamapi;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jconner
 */
@XmlRootElement(name="rss")
public class RssBean {
    private ChannelBean channel;
    
    public RssBean() {
        
    }

    public ChannelBean getChannel() {
        return channel;
    }

    public void setChannel(ChannelBean channel) {
        this.channel = channel;
    }
    
}
