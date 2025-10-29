package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   @Column(name = "name")
   private final String firstName;

   @Column(name = "last_name")
   private final String lastName;

   @Column(name = "email")
   private final String email;

   @OneToOne(cascade = CascadeType.ALL)
   @JoinColumn(name = "car_id")
   private Car car;

   protected User() {
      this.firstName = null;
      this.lastName = null;
      this.email = null;
   }
   
   public User(String firstName, String lastName, String email, Car car) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.email = email;
      this.car = car;
   }

   public Long getId() {
      return id;
   }
   public String getFirstName() {
      return firstName;
   }
   public String getLastName() {
      return lastName;
   }
   public String getEmail() {
      return email;
   }
   public String getCar() { return car.toString(); }
}
