package com.geebrains.geekchage.hibernate;

import javax.persistence.*;




  //  public getDetails;

    @Entity
        @Table(name = "users")
        public class Users {


            @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
            @Column(name = "id")
            private Long id;
            @Column(name = "name")
            private String name;

            @OneToOne
            @JoinColumn(name = "details_id")
            private UserDetails details;

        public Users() {

        }



        public void setId(Long id) {
                this.id = id;
            }

            public void setName(String name) {
                this.name = name;
            }

           public void setDetails(UserDetails details) {
               this.details = details;
            }

            public Long getId() {
                return id;
            }

            public String getName() {
                return name;
            }

         public UserDetails getDetails() {
               return details;
           }

        public Users (Long id, String name, UserDetails details) {
            this.id = id;
            this.name = name;
            this.details = details;
        }

        @Override
            public String toString() {
                return String.format("Users [id= %d,name = '%s']", id, name);
            }
        }



