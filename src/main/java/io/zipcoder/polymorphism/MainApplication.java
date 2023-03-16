package io.zipcoder.polymorphism;

import java.util.Scanner;

public class MainApplication {
    static String askForPetName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name for your pet: ");
        String name = scanner.nextLine();
        return name;
    }

    static void printPets(Pet[] pets){
        if (pets != null) {
            for(Pet pet : pets){
                String kind = (pet instanceof Cat) ? "cat" :
                        (pet instanceof Dog) ? "dog" : "bird";
                System.out.format("'%s %s' from %s the %s!\n",pet.speak(),pet.speak(),pet.getName(),kind);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many pets do you have ? : ");
        Integer input = scanner.nextInt();
        Pet[] pets = new Pet[input];
        for(int i = 0; i < input;i++){
            System.out.format("Enter your type of pet #%d (cat|dog|bird): ",i+1);
            String petType = scanner.next();
            switch(petType){
                case "cat":
                    String catName = askForPetName();
                    Pet cat = new Cat(catName);
                    pets[i] = cat;
                    break;
                case "dog":
                    String dogName = askForPetName();
                    Pet dog = new Dog(dogName);
                    pets[i] = dog;
                    break;
                case "bird":
                    String birdName = askForPetName();
                    Pet bird = new Cat(birdName);
                    pets[i] = bird;
                    break;
                default:
                    i--;
                    break;
            }
        }
        printPets(pets);
    }
}
