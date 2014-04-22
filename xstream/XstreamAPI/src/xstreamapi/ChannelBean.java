/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package xstreamapi;

import java.util.List;

/**
 *
 * @author jconner
 */
public class ChannelBean {
    
    private String title;
    private String link;
    private String description;
    private ImageBean image;
    private AtomBean atom;
    private List<ItemBean> item;
    
    public ChannelBean() {
        
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ImageBean getImage() {
        return image;
    }

    public void setImage(ImageBean image) {
        this.image = image;
    }

    public AtomBean getAtom() {
        return atom;
    }

    public void setAtom(AtomBean atom) {
        this.atom = atom;
    }

    public List<ItemBean> getItem() {
        return item;
    }

    public void setItem(List<ItemBean> item) {
        this.item = item;
    }
    
}
