package com.scm.contactmanger.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.*;

@Entity(name="user")
@Table(name="users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class user {
    @Id
    @Column(name = "user_ide")
    private String id;
    @Column(unique = true,nullable = false)
    private String username;
    private String password;
    private String email;
    @Column(length = 1000)
    private String about;
    private String profilepic;
    private String phonenumber;
    @Builder.Default
    private boolean enabled=false;
    @Builder.Default
    private boolean email_verified=false;
    @Builder.Default
    private boolean phone_verified=false;
    // @Enumerated(value = EnumType.STRING)
    @Enumerated(value = EnumType.STRING)
    @Builder.Default
    private providers provider=providers.SELF;
    private String providerUserId;
    @OneToMany(mappedBy = "usr",cascade = CascadeType.ALL,fetch = FetchType.LAZY,orphanRemoval = true)
    @Builder.Default
    private List<Contact> contacts=new ArrayList<>();

}
