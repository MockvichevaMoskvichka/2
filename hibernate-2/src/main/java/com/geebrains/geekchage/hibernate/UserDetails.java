package com.geebrains.geekchage.hibernate;

import javax.persistence.*;

//public class UserDetails {





          @Entity
        @Table(name = "users")
        public class UserDetails  {


            @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
            @Column(name = "id")
            private Long id;
            @Column(name = "email")
            private String email;

            @Column(name = "city")
            private String city;

            @OneToOne(mappedBy = "details")
            private Users user;

            @OneToOne
            @JoinColumn(name = "details_id")
            private Users details;
            private String name;

            public UserDetails () {

            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getCity() {
                return city;
            }

            public void setId(Long id) {
                this.id = id;
            }

            public void setName(String name) {
                this.name = name;
            }

            public void setDetails(Users details) {
                this.details = details;
            }

            public Long getId() {
                return id;
            }

            public String getName() {
                return name;
            }

            public Users getDetails() {
                return details;
            }


              public UserDetails (Long id, String email, String city, Users user, Users details, String name) {
                  this.id = id;
                  this.email = email;
                  this.city = city;
                  this.user = user;
                  this.details = details;
                  this.name = name;
              }

              @Override
            public String toString() {
                return String.format("UserDetails  [id= %d,  email = '%s,  city = %d']", id, email, city);
            }
        }







