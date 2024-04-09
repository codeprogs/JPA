package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.enums.ArmorType;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "head_armor")
public class HeadArmor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "name")
    private String name;

    @Column(name = "armor_type")
    @Enumerated(EnumType.STRING)
    private ArmorType armorType;

    @Column(name = "armor_level")
    private Integer armorLevel;

    @Column(name = "armor_points")
    private Integer armorPoints;

}
