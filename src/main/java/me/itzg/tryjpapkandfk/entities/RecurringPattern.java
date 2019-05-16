package me.itzg.tryjpapkandfk.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.Data;
import me.itzg.tryjpapkandfk.types.RecurringType;

@Entity
@Data
public class RecurringPattern implements Serializable {
  @Id
  @ManyToOne
  Event event;

  @Enumerated(EnumType.STRING)
  RecurringType type;
}
