package me.itzg.tryjpapkandfk.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Data
public class Event {
  @Id @GeneratedValue
  long id;

  @NotBlank
  String eventTitle;

  @OneToOne
  Event parent;
}
