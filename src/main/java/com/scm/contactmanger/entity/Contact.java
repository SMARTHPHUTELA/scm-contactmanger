
package com.scm.contactmanger.entity;
import java.util.*;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

@Table(name="contacts")
public class Contact {
    @Id
    private String id;
    private String name;
    private String phonenumber;
    private String email;
    @Column(length=1000)
    private String adress;
    private String description;
    private String picture;
    private boolean favorite=false;
    private List<String> social_link=new ArrayList<>();
    @ManyToOne
    private user usr;
    @OneToMany(mappedBy = "contact",cascade = CascadeType.ALL,fetch = FetchType.EAGER,orphanRemoval = true)
    private List<SocialLink> links=new ArrayList<>();
}
