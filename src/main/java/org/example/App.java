package org.example;

import org.example.configs.DBConfig;
import org.example.entity.BodyArmor;
import org.example.entity.Character;
import org.example.entity.HeadArmor;
import org.example.enums.ArmorType;
import org.example.enums.CharacterType;
import org.example.service.BodyArmorService;
import org.example.service.CharacterService;
import org.example.service.HeadArmorService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Optional;
import java.util.UUID;

public class App
{
    public static void main( String[] args ) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DBConfig.class);

        CharacterService characterService = context.getBean(CharacterService.class);
//        BodyArmorService bodyArmorService = context.getBean(BodyArmorService.class);
//        HeadArmorService headArmorService = context.getBean(HeadArmorService.class);

//        Character char1 = Character.builder()
//                .name("SuperChar")
//                .characterType(CharacterType.ARCHER)
//                .healthPoint(300)
//                .manaPoint(400)
//                .headArmor(HeadArmor.builder()
//                        .name("Crystal Helmet")
//                        .armorLevel(5)
//                        .armorPoints(500)
//                        .armorType(ArmorType.PLATE)
//                        .build())
//                .bodyArmor(BodyArmor.builder()
//                        .name("Crystal Plate")
//                        .armorLevel(5)
//                        .armorPoints(1000)
//                        .armorType(ArmorType.PLATE)
//                        .build())
//                .build();
//
//        characterService.add(char1);

//        characterService.findAll().forEach(System.out::println);

//        System.out.println(characterService.findCharacterById(
//                UUID.fromString("42c1a659-3a42-44bb-bcd4-c5a0b44eef30")
//        ));

//        characterService.delete(
//                UUID.fromString("9d0f1d10-5e70-4b87-9030-49022e58c356")
//        );
    }
}
