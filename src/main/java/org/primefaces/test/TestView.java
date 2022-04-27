package org.primefaces.test;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.math.BigDecimal;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import lombok.Data;
import org.primefaces.model.mindmap.DefaultMindmapNode;
import org.primefaces.model.mindmap.MindmapNode;

@Data
@Named
@ViewScoped
public class TestView implements Serializable {
    
    private String string;
    private Integer integer;
    private BigDecimal decimal;
    private LocalDateTime localDateTime;

    private MindmapNode root;
    private MindmapNode root2;

    @PostConstruct  
    public void init() {
        string = "Welcome to PrimeFaces!!!";

        root=new DefaultMindmapNode("GeometrisFormen","Root Data", "#004b76",false);
        MindmapNode node1=new DefaultMindmapNode("Node No1","Node Date No1", "#99c9e2",false);
        MindmapNode node2=new DefaultMindmapNode("Node No2","Node Data No2", "#99c9e2",false);

        root.addNode(node1);
        root.addNode(node2);


        root2=new DefaultMindmapNode("GeometriFormen","Root Data", "#004b76",false);
        MindmapNode node3=new DefaultMindmapNode("Node No1","Node Date No1", "#99c9e2",false);
        MindmapNode node4=new DefaultMindmapNode("Node No2","Node Data No2", "#99c9e2",false);

        root2.addNode(node3);
        root2.addNode(node4);
    }

}
