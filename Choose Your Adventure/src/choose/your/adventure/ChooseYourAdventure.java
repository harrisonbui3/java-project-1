/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package choose.your.adventure;

import java.util.Scanner;

/**
 *
 * @author Education Unlimited
 */
public class ChooseYourAdventure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int stamina = 200;
        int health = 500;
        int magic = 200;
        //Creation of Character
        System.out.println("You are a warrior from a special guild called the...(enter the name of your guild)");
        String guild = keyboard.nextLine();

        System.out.println(guild + " guild. \nAs the sole survivor of the onslaught three years ago, it is your sole duty to protect the people of Eragor, which is being oppressed by the orcs led by Jdolkc. \nAs you continue on your journey with your...(choose one of the following: \n A. sword \n B. axe \n C. stake \n D. mace) ");
        String weaponChoose1 = keyboard.nextLine();

        if (weaponChoose1.equals("A.")) {
            System.out.println(" sword. You also possess magic capabilities allowing you to...(enter one \n A. communicate with animals \n B. have a sixth sense. \n C. heal yourself in an instant. \n D. cloak yourself with darkness rendering yourself invisible.)");
            String magicChoose1 = keyboard.nextLine();

            if (magicChoose1.equals("A.")) {
                //sword with animal communication
                System.out.println(" communicate with animals. \n\n As you travel on your chestnut-colored horse, you scan your surroundings. \nSnow covers ground as far as you can see. \nYou have been traveling for days and you are exhausted. \nHowever you remind yourself that it is your duty to protect others who fall under the savagery of the orcs. A cold wave of fear courses through your body as you remember the remains of villagers from the previous town. \nYou had arrived too late and followed the trail the orcs left behind, vowing to avenge the victims.\n Suddenly, a strong smell hits your nose. Sulfur, ashes. The orcs must be nearby!! \nYou scan the sky for any sign of a camp. Sure enough, a trail of black smoke swivels in the air about two miles ahead. \nYou urge you horse to move on, only to run into an enormous mountain blocking your way. \nNearby the mountain, you see a pack of wolves, watching your intently, assessing the threat. You get off of your horse and urge it to go back. \nYou could walk around the mountain but concern for any prisoners the orcs might have cloud your mind. (Choose your action: \n A. walk around the mountain. \n B. scale the mountain. \n C. ask the wolves for assistance.");
                String path1 = keyboard.nextLine();
                if (path1.equals("A.")) {
                    stamina -= 10;
                    System.out.println("Stamina: " + stamina);
                    System.out.println(". You quickly slosh your way through the thick snow. \nThe bitter cold bites your face but you shake the feeling off. \n The wolves, realizing that you pose no threat, head deeper into the forest. Eventually, you make it past the mountain and are almost upon the orc camp. \nSuddenly, you hear an orc patrol walking by...(Choose one: \n\n A. climb the tree and wait for a perfect opportunity to stike. \n B. leap out and fight the orcs. \n C. hide in the bushes and let the orcs pass");
                    String tactic1 = keyboard.nextLine();

                    if (tactic1.equals("A.")) {
                        System.out.println("You quickly climb onto the tree and watch the ground below. Only two orcs are passing below you. \nYou take your " + weaponChoose1 + " and jump down, swinging your weapon with a devastating downward strike. \n The left orc dies instantly and the right orc leaps back in surprise");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("B.")) {
                        System.out.println("You leap out into the open and encounter two orcs. \nThe orcs are stunned by entrance and you dash forward with your " + weaponChoose1 + " ready.");
                        //int result = fight(1,"standard");
                    } else {
                        System.out.println("You crouch into the prickly bushes and stay as still as you can. \n The chilling wind howls around you but you force yourself to stay still. \n You patience was worthwhile as five heavily armored orcs stomp across the road.\n When you are certain that the road is clear, you exit the bushes and carefully follow the orcs' trails");
                    }
                } else if (path1.equals("C.")) {
                    System.out.println(". You walk to the wolves and raise for hands to show that you pose no threat. \n Steadily, the alpha of the pack approaches you. You ask the alpha for a safe passage through the mountain. \n With no words exchanged, the alpha beckons you to follow it and leads you through a hidden tunnel through the mountain. \n After you make it across, you thank the alpha, who leaves with its pack. Suddenly, you hear an orc patrol walking by...(Choose one: \n\nA. climb a tree and wait for the perfect opportunity to strike. \n B. leap out and fight the orcs. \n C. hide inthe bushes and let the orcs pass");
                    String tactic1 = keyboard.nextLine();
                    if (tactic1.equals("A.")) {
                        System.out.println("You quickly climb onto the tree and watch the ground below. \nOnly two orcs are passing below you. \nYou take your " + weaponChoose1 + " and jump down, swinging your weapon with a devastating downward strike. \n The left orc dies instantly and the right orc leaps back in surprise");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("B.")) {
                        System.out.println("You leap out into the open and encounter two orcs. \nThe orcs are stunned by entrance and you dash forward with your " + weaponChoose1 + " ready.");
                        //int result = fight(1,"standard");
                    } else {
                        System.out.println("You crouch into the prickly bushes and stay as still as you can. \n The chilling wind howls around you but you force yourself to stay still. \n You patience was worthwhile as five heavily armored orcs stomp across the road.\n When you are certain that the road is clear, you exit the bushes and carefully follow the orcs' trails");
                    }
                } else {
                    stamina -= 15;
                    System.out.println("Stamina: " + stamina);
                    health -= 10;
                    System.out.println(". You prepare yourself for the arduous climb. You grab hold of the rocks. \nAs you climb upward, you suddenly slip and injure yourself on the jagged rocks and obtain a minor flesh wound. \n However, you quickly adapt to your situation and make it past the mountain with caution. \nSuddenly, you hear an orc patrol passing by below ...(Choose one: \n\n A. leap onto a nearby tree and strike from above. \n B. charge straight for the orcs. \n C.wait for the orcs to pass by ");
                    String tactic1 = keyboard.nextLine();
                    if (tactic1.equals("A.")) {
                        System.out.println("You quickly climb onto the tree and watch the ground below. \nOnly two orcs are passing below you. \nYou take your " + weaponChoose1 + " and jump down, swinging your weapon with a devastating downward strike. \n The left orc dies instantly and the right orc leaps back in surprise");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("B.")) {
                        System.out.println("You leap out into the open and encounter two orcs. \nThe orcs are stunned by entrance and you dash forward with your " + weaponChoose1 + " ready.");
                        //int result = fight(1,"standard");
                    } else {
                        System.out.println("You crouch into the prickly bushes and stay as still as you can. \n The chilling wind howls around you but you force yourself to stay still. \n You patience was worthwhile as five heavily armored orcs stomp across the road.\n When you are certain that the road is clear, you exit the bushes and carefully follow the orcs' trails");
                    }
                }
            } else if (magicChoose1.equals(
                    "B.")) {
                //sword with sixth sense
                System.out.println(" have a sixth sense. \n\n As you travel on your chestnut-colored horse, you scan your surroundings. \nSnow covers ground as far as you can see. \nYou have been traveling for days and you are exhausted. \nHowever you remind yourself that it is your duty to protect others who fall under the savagery of the orcs. \nA cold wave of fear courses through your body as you remember the remains of villagers from the previous town. \nYou had arrived too late and followed the trail the orcs left behind, vowing to avenge the victims.\n Suddenly, a strong smell hits your nose. Sulfur, ashes. The orcs must be nearby!! \nYou scan the sky for any sign of a camp. Sure enough, a trail of black smoke swivels in the air about two miles ahead. \nYou urge you horse to move on, only to run into an enormous mountain blocking your way. \nNearby the mountain, you see a pack of wolves, watching your intently, assessing the threat. \nYou get off of your horse and urge it to go back. You could walk around the mountain but concern for any prisoners the orcs might have cloud your mind.(Choose your action: \n A. walk around the mountain. \n B. scale the mountain.");
                String path1 = keyboard.nextLine();
                if (path1.equals("A.")) {
                    stamina -= 10;
                    System.out.println("Stamina: " + stamina);
                    System.out.println(". You quickly slosh your way through the thick snow. The bitter cold bites your face but you shake the feeling off. \n The wolves, realizing that you pose no threat, head deeper into the forest. Eventually, you make it past the mountain and are almost upon the orc camp. \nSuddenly, you hear an orc patrol walking by...(Choose one: \n\n A. climb the tree and wait for a perfect opportunity to stike. \n B. leap out and fight the orcs. \n C. hide in the bushes and let the orcs pass");
                    String tactic1 = keyboard.nextLine();
                    if (tactic1.equals("A.")) {
                        System.out.println("You quickly climb onto the tree and watch the ground below. Only two orcs are passing below you. \nYou take your " + weaponChoose1 + " and jump down, swinging your weapon with a devastating downward strike. \n The left orc dies instantly and the right orc leaps back in surprise");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("B.")) {
                        System.out.println("You leap out into the open and encounter two orcs. \nThe orcs are stunned by entrance and you dash forward with your " + weaponChoose1 + " ready.");
                        //int result = fight(1,"standard");
                    } else {
                        System.out.println("You crouch into the prickly bushes and stay as still as you can. \n The chilling wind howls around you but you force yourself to stay still. \n You patience was worthwhile as five heavily armored orcs stomp across the road.\n When you are certain that the road is clear, you exit the bushes and carefully follow the orcs' trails");
                    }
                } else {
                    stamina -= 5;
                    System.out.println("Stamina: " + stamina);
                    System.out.println(". You prepare yourself for the arduous climb. You grab hold of the rocks. As you climb upward, your sixth sense kicks in. \n You quickly navigate over the moutnain with ease. Suddenly, you hear an orc patrol passing by below ...(Choose one: \n\n A. leap onto a nearby tree and strike from above. \n B. charge straight for the orcs. \n C.wait for the orcs to pass by ");
                    String tactic1 = keyboard.nextLine();
                    if (tactic1.equals("A.")) {
                        System.out.println("You quickly climb onto the tree and watch the ground below. Only two orcs are passing below you. \nYou take your " + weaponChoose1 + " and jump down, swinging your weapon with a devastating downward strike. \n The left orc dies instantly and the right orc leaps back in surprise");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("B.")) {
                        System.out.println("You leap out into the open and encounter two orcs. The orcs are stunned by entrance and you dash forward with your " + weaponChoose1 + " ready.");
                        //int result = fight(1,"standard");
                    } else {
                        System.out.println("You crouch into the prickly bushes and stay as still as you can. \n The chilling wind howls around you but you force yourself to stay still. \n You patience was worthwhile as five heavily armored orcs stomp across the road.\n When you are certain that the road is clear, you exit the bushes and carefully follow the orcs' trails");
                    }
                }

            } else if (magicChoose1.equals(
                    "C.")) {
                //sword with healing abilities
                System.out.println(" heal yourself in an instant. \n\n As you travel on your chestnut-colored horse, you scan your surroundings. Snow covers ground as far as you can see. \nYou have been traveling for days and you are exhausted. However you remind yourself that it is your duty to protect \nothers who fall under the savagery of the orcs. A cold wave of fear courses through your body as you remember the remains of villagers from the previous town. You had \narrived too late and followed the trail the orcs left behind, vowing to avenge the victims.\n Suddenly, a strong smell hits your nose. Sulfur, ashes. The orcs must be nearby!! You scan the sky for any sign of a camp. Sure enough, a trail of black smoke swivels \n in the air about two miles ahead. You urge you horse to move on, only to run into an enormous mountain blocking your way. \nNearby the mountain, you see a pack of wolves, watching your intently, assessing the threat. You get off of your horse and urge it to go back. You could walk around the mountain but concern for any prisoners the orcs might have cloud your mind.(Choose your action: \n A. walk around the mountain. \n B. scale the mountain.");
                String path1 = keyboard.nextLine();
                if (path1.equals("A.")) {
                    stamina -= 10;
                    System.out.println("Stamina: " + stamina);
                    System.out.println(". You quickly slosh your way through the thick snow. The bitter cold bites your face but you shake the feeling off. \n The wolves, realizing that you pose no threat, head deeper into the forest. \nEventually, you make it past the mountain and are almost upon the orc camp. \nSuddenly, you hear an orc patrol walking by...(Choose one: \n\n A. climb the tree and wait for a perfect opportunity to stike. \n B. leap out and fight the orcs. \n C. hide in the bushes and let the orcs pass");
                    String tactic1 = keyboard.nextLine();
                    if (tactic1.equals("A.")) {
                        System.out.println("You quickly climb onto the tree and watch the ground below. Only two orcs are passing below you. \nYou take your " + weaponChoose1 + " and jump down, swinging your weapon with a devastating downward strike. \n The left orc dies instantly and the right orc leaps back in surprise");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("B.")) {
                        System.out.println("You leap out into the open and encounter two orcs. The orcs are stunned by entrance and you dash forward with your " + weaponChoose1 + " ready.");
                        //int result = fight(1,"standard");
                    } else {
                        System.out.println("You crouch into the prickly bushes and stay as still as you can. \n The chilling wind howls around you but you force yourself to stay still. \n You patience was worthwhile as five heavily armored orcs stomp across the road.\n When you are certain that the road is clear, you exit the bushes and carefully follow the orcs' trails");
                    }
                } else {
                    stamina -= 15;
                    System.out.println("Stamina: " + stamina);
                    magic -= 5;
                    System.out.println("Magic: " + magic);
                    System.out.println(". You prepare yourself for the arduous climb. You grab hold of the rocks. As you climb upward, you suddenly slip and injure yourself on the jagged rocks and obtain a minor flesh wound. Fortunately, your healing \n abilities kick in and heal your injury.You quickly adapt to your situation and make it past the mountain with caution. Suddenly, you hear an orc patrol passing by below ...(Choose one: \n\n A. leap onto a nearby tree and strike from above. \n B. charge straight for the orcs. \n C.wait for the orcs to pass by ");
                    String tactic1 = keyboard.nextLine();
                    if (tactic1.equals("A.")) {
                        System.out.println("You quickly climb onto the tree and watch the ground below. Only two orcs are passing below you. \nYou take your " + weaponChoose1 + " and jump down, swinging your weapon with a devastating downward strike. \n The left orc dies instantly and the right orc leaps back in surprise");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("B.")) {
                        System.out.println("You leap out into the open and encounter two orcs. The orcs are stunned by entrance and you dash forward with your " + weaponChoose1 + " ready.");
                        //int result = fight(1,"standard");
                    } else {
                        System.out.println("You crouch into the prickly bushes and stay as still as you can. \n The chilling wind howls around you but you force yourself to stay still. \n You patience was worthwhile as five heavily armored orcs stomp across the road.\n When you are certain that the road is clear, you exit the bushes and carefully follow the orcs' trails");
                    }
                }
            } else if (magicChoose1.equals("D.")) {
                //sword with invisibility
                System.out.println(" cloak yourself with darkness rendering yourself invisible. \n\n As you travel on your chestnut-colored horse, you scan your surroundings. Snow covers ground as far as you can see. \nYou have been traveling for days and you are exhausted. However you remind yourself that it is your duty to protect \nothers who fall under the savagery of the orcs. A cold wave of fear courses through your body as you remember the remains of villagers from the previous town. You had \narrived too late and followed the trail the orcs left behind, vowing to avenge the victims.\n Suddenly, a strong smell hits your nose. Sulfur, ashes. The orcs must be nearby!! You scan the sky for any sign of a camp. Sure enough, a trail of black smoke swivels \n in the air about two miles ahead. You urge you horse to move on, only to run into an enormous mountain blocking your way. \nNearby the mountain, you see a pack of wolves, watching your intently, assessing the threat. You get off of your horse and urge it to go back. (You could walk around the mountain but concern for any prisoners the orcs might have cloud your mind.Choose your action: \n A. walk around the mountain. \n B. scale the mountain.");
                String path1 = keyboard.nextLine();
                if (path1.equals("A.")) {
                    stamina -= 10;
                    System.out.println("Stamina: " + stamina);
                    System.out.println(". You quickly slosh your way through the thick snow. The bitter cold bites your face but you shake the feeling off. \n The wolves, realizing that you pose no threat, head deeper into the forest. Eventually, you make it past the mountain and are almost upon the orc camp. Suddenly, you hear an orc patrol walking by...(Choose one: \n\n A. climb the tree and wait for a perfect opportunity to stike. \n B. leap out and fight the orcs. \n C. hide in the bushes and let the orcs pass. \n D. use your invisibility to take out as many orcs as possible");
                    String tactic1 = keyboard.nextLine();
                    if (tactic1.equals("A.")) {
                        System.out.println("You quickly climb onto the tree and watch the ground below. Only two orcs are passing below you. \nYou take your " + weaponChoose1 + " and jump down, swinging your weapon with a devastating downward strike. \n The left orc dies instantly and the right orc leaps back in surprise");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("B.")) {
                        System.out.println("You leap out into the open and encounter two orcs. The orcs are stunned by entrance and you dash forward with your " + weaponChoose1 + " ready.");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("C.")){
                        System.out.println("You crouch into the prickly bushes and stay as still as you can. \n The chilling wind howls around you but you force yourself to stay still. \n You patience was worthwhile as five heavily armored orcs stomp across the road.\n When you are certain that the road is clear, you exit the bushes and carefully follow the orcs' trails");
                    }
                    else{
                        System.out.println ("Calling upon the power of darkness, your body morphs itself into a dark shadow.\n You propel yourself towards the orcs at speeds orc eyes could never comprehend.\n Seeing only two orcs, you unsheath your " + weaponChoose1 + " and execute the orc on the left.\n An instant later, the other orc met the same fate.\n You search the corpses of the orcs. \n On them were 80 gold, a rusty saw blade, and leather armor. \n\nYou take your loot. Enter '1','2','3',or 'done'");
                        //create arrays for satchel and enemy loots 
                    }
                    } else {
                    stamina -= 15;
                    System.out.println("Stamina: " + stamina);
                    health -= 10;
                    System.out.println(". You prepare yourself for the arduous climb. You grab hold of the rocks. As you climb upward, you suddenly slip and injure yourself on the jagged rocks and obtain a minor flesh wound. \n However, you quickly adapt to your situation and make it past the mountain with caution. Suddenly, you hear an orc patrol passing by below ...(Choose one: \n\n A. leap onto a nearby tree and strike from above. \n B. charge straight for the orcs. \n C.wait for the orcs to pass by. \n D. use your invisibility to take out as many orcs as possible ");
                    String tactic1 = keyboard.nextLine();
                    if (tactic1.equals("A.")) {
                        System.out.println("You quickly climb onto the tree and watch the ground below. Only two orcs are passing below you. \nYou take your " + weaponChoose1 + " and jump down, swinging your weapon with a devastating downward strike. \n The left orc dies instantly and the right orc leaps back in surprise");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("B.")) {
                        System.out.println("You leap out into the open and encounter two orcs. The orcs are stunned by entrance and you dash forward with your " + weaponChoose1 + " ready.");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("C.")){
                        System.out.println("You crouch into the prickly bushes and stay as still as you can. \n The chilling wind howls around you but you force yourself to stay still. \n You patience was worthwhile as five heavily armored orcs stomp across the road.\n When you are certain that the road is clear, you exit the bushes and carefully follow the orcs' trails");
                    }
                    else{
                        System.out.println ("Calling upon the power of darkness, your body morphs itself into a dark shadow.\n You propel yourself towards the orcs at speeds orc eyes could never comprehend.\n Seeing only two orcs, you unsheath your " + weaponChoose1 + " and execute the orc on the left.\n An instant later, the other orc met the same fate.\n You search the corpses of the orcs. \n On them were 80 gold, a rusty saw blade, and leather armor. \n\nYou take your loot. Enter '1','2','3',or 'done'");
                        //create arrays for satchel and enemy loots 
                    }
                }
            } else {
                //sword with no magic
                System.out.println(" ... Correction: You don't have any magic abilities.");
                String path1 = keyboard.nextLine();
                if (path1.equals("A.")) {
                    stamina -= 10;
                    System.out.println("Stamina: " + stamina);
                    System.out.println(". You quickly slosh your way through the thick snow. The bitter cold bites your face but you shake the feeling off. \n The wolves, realizing that you pose no threat, head deeper into the forest. Eventually, you make it past the mountain and are almost upon the orc camp. Suddenly, you hear an orc patrol walking by...(Choose one: \n\n A. climb the tree and wait for a perfect opportunity to stike. \n B. leap out and fight the orcs. \n C. hide in the bushes and let the orcs pass");
                    String tactic1 = keyboard.nextLine();
                    if (tactic1.equals("A.")) {
                        System.out.println("You quickly climb onto the tree and watch the ground below. Only two orcs are passing below you. \nYou take your " + weaponChoose1 + " and jump down, swinging your weapon with a devastating downward strike. \n The left orc dies instantly and the right orc leaps back in surprise");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("B.")) {
                        System.out.println("You leap out into the open and encounter two orcs. The orcs are stunned by entrance and you dash forward with your " + weaponChoose1 + " ready.");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("C.")){
                        System.out.println("You crouch into the prickly bushes and stay as still as you can. \n The chilling wind howls around you but you force yourself to stay still. \n You patience was worthwhile as five heavily armored orcs stomp across the road.\n When you are certain that the road is clear, you exit the bushes and carefully follow the orcs' trails");
                    }
                } else {
                    stamina -= 15;
                    System.out.println("Stamina: " + stamina);
                    health -= 10;
                    System.out.println(". You prepare yourself for the arduous climb. You grab hold of the rocks. As you climb upward, you suddenly slip and injure yourself on the jagged rocks and obtain a minor flesh wound. \n However, you quickly adapt to your situation and make it past the mountain with caution. Suddenly, you hear an orc patrol passing by below ...(Choose one: \n\n A. leap onto a nearby tree and strike from above. \n B. charge straight for the orcs. \n C.wait for the orcs to pass by ");
                    String tactic1 = keyboard.nextLine();
                    if (tactic1.equals("A.")) {
                        System.out.println("You quickly climb onto the tree and watch the ground below. Only two orcs are passing below you. \nYou take your " + weaponChoose1 + " and jump down, swinging your weapon with a devastating downward strike. \n The left orc dies instantly and the right orc leaps back in surprise");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("B.")) {
                        System.out.println("You leap out into the open and encounter two orcs. The orcs are stunned by entrance and you dash forward with your " + weaponChoose1 + " ready.");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("C.")){
                        System.out.println("You crouch into the prickly bushes and stay as still as you can. \n The chilling wind howls around you but you force yourself to stay still. \n You patience was worthwhile as five heavily armored orcs stomp across the road.\n When you are certain that the road is clear, you exit the bushes and carefully follow the orcs' trails");
                    }
                }
            }

        } else if (weaponChoose1.equals("B.")) {
            System.out.println(" axe. You also possess magic capabilities allowing you to...(enter one \n A. communicate with animals \n B. have a sixth sense. \n C. healing abilities. \n D. cloak yourself with darkness rendering yourself invisible.)");
            String magicChoose1 = keyboard.nextLine();

            if (magicChoose1.equals("A.")) {
                //axe with animals communication
                System.out.println(" communicate with animals. \n\n As you travel on your chestnut-colored horse, you scan your surroundings. Snow covers ground as far as you can see. \nYou have been traveling for days and you are exhausted. However you remind yourself that it is your duty to protect \nothers who fall under the savagery of the orcs. A cold wave of fear courses through your body as you remember the remains of villagers from the previous town. You had \narrived too late and followed the trail the orcs left behind, vowing to avenge the victims.\n Suddenly, a strong smell hits your nose. Sulfur, ashes. The orcs must be nearby!! You scan the sky for any sign of a camp. Sure enough, a trail of black smoke swivels \n in the air about two miles ahead. You urge you horse to move on, only to run into an enormous mountain blocking your way. \nNearby the mountain, you see a pack of wolves, watching your intently, assessing the threat. You get off of your horse and urge it to go back. You could walk around the mountain but concern for any prisoners the orcs might have cloud your mind.(Choose your action: \n A. walk around the mountain. \n B. scale the mountain. \n C. ask the wolves for assistance.");
                String path1 = keyboard.nextLine();
                if (path1.equals("A.")) {
                    stamina -= 10;
                    System.out.println("Stamina: " + stamina);
                    System.out.println(". You quickly slosh your way through the thick snow. The bitter cold bites your face but you shake the feeling off. \n The wolves, realizing that you pose no threat, head deeper into the forest. Eventually, you make it past the mountain and are almost upon the orc camp. Suddenly, you hear an orc patrol walking by...(Choose one: \n\n A. climb the tree and wait for a perfect opportunity to stike. \n B. leap out and fight the orcs. \n C. hide in the bushes and let the orcs pass");
                    String tactic1 = keyboard.nextLine();
                    if (tactic1.equals("A.")) {
                        System.out.println("You quickly climb onto the tree and watch the ground below. Only two orcs are passing below you. \nYou take your " + weaponChoose1 + " and jump down, swinging your weapon with a devastating downward strike. \n The left orc dies instantly and the right orc leaps back in surprise");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("B.")) {
                        System.out.println("You leap out into the open and encounter two orcs. The orcs are stunned by entrance and you dash forward with your " + weaponChoose1 + " ready.");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("C.")){
                        System.out.println("You crouch into the prickly bushes and stay as still as you can. \n The chilling wind howls around you but you force yourself to stay still. \n You patience was worthwhile as five heavily armored orcs stomp across the road.\n When you are certain that the road is clear, you exit the bushes and carefully follow the orcs' trails");
                    }
                } else if (path1.equals("C.")) {
                    System.out.println(". You walk to the wolves and raise for hands to show that you pose no threat. \n Steadily, the alpha of the pack approaches you. You ask the alpha for a safe passage through the mountain. \n With no words exchanged, the alpha beckons you to follow it and leads you through a hidden tunnel through the mountain. \n After you make it across, you thank the alpha, who leaves with its pack. Suddenly, you hear an orc patrol walking by...(Choose one: \n\nA. climb a tree and wait for the perfect opportunity to strike. \n B. leap out and fight the orcs. \n C. hide inthe bushes and let the orcs pass");
                    String tactic1 = keyboard.nextLine();
                    if (tactic1.equals("A.")) {
                        System.out.println("You quickly climb onto the tree and watch the ground below. Only two orcs are passing below you. \nYou take your " + weaponChoose1 + " and jump down, swinging your weapon with a devastating downward strike. \n The left orc dies instantly and the right orc leaps back in surprise");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("B.")) {
                        System.out.println("You leap out into the open and encounter two orcs. The orcs are stunned by entrance and you dash forward with your " + weaponChoose1 + " ready.");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("C.")){
                        System.out.println("You crouch into the prickly bushes and stay as still as you can. \n The chilling wind howls around you but you force yourself to stay still. \n You patience was worthwhile as five heavily armored orcs stomp across the road.\n When you are certain that the road is clear, you exit the bushes and carefully follow the orcs' trails");
                    }
                } else {
                    stamina -= 15;
                    System.out.println("Stamina: " + stamina);
                    health -= 10;
                    System.out.println(". You prepare yourself for the arduous climb. You grab hold of the rocks. As you climb upward, you suddenly slip and injure yourself on the jagged rocks and obtain a minor flesh wound. \n However, you quickly adapt to your situation and make it past the mountain with caution. Suddenly, you hear an orc patrol passing by below ...(Choose one: \n\n A. leap onto a nearby tree and strike from above. \n B. charge straight for the orcs. \n C.wait for the orcs to pass by ");
                    String tactic1 = keyboard.nextLine();
                    if (tactic1.equals("A.")) {
                        System.out.println("You quickly climb onto the tree and watch the ground below. Only two orcs are passing below you. \nYou take your " + weaponChoose1 + " and jump down, swinging your weapon with a devastating downward strike. \n The left orc dies instantly and the right orc leaps back in surprise");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("B.")) {
                        System.out.println("You leap out into the open and encounter two orcs. The orcs are stunned by entrance and you dash forward with your " + weaponChoose1 + " ready.");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("C.")){
                        System.out.println("You crouch into the prickly bushes and stay as still as you can. \n The chilling wind howls around you but you force yourself to stay still. \n You patience was worthwhile as five heavily armored orcs stomp across the road.\n When you are certain that the road is clear, you exit the bushes and carefully follow the orcs' trails");
                    }
                }
            } else if (magicChoose1.equals("B.")) {
                //axe with sixth sense
                System.out.println(" have a sixth sense. \n\n As you travel on your chestnut-colored horse, you scan your surroundings. Snow covers ground as far as you can see. \nYou have been traveling for days and you are exhausted. However you remind yourself that it is your duty to protect \nothers who fall under the savagery of the orcs. A cold wave of fear courses through your body as you remember the remains of villagers from the previous town. You had \narrived too late and followed the trail the orcs left behind, vowing to avenge the victims.\n Suddenly, a strong smell hits your nose. Sulfur, ashes. The orcs must be nearby!! You scan the sky for any sign of a camp. Sure enough, a trail of black smoke swivels \n in the air about two miles ahead. You urge you horse to move on, only to run into an enormous mountain blocking your way. \nNearby the mountain, you see a pack of wolves, watching your intently, assessing the threat. You get off of your horse and urge it to go back. You could walk around the mountain but concern for any prisoners the orcs might have cloud your mind.(Choose your action: \n A. walk around the mountain. \n B. scale the mountain.");
                String path1 = keyboard.nextLine();
                if (path1.equals("A.")) {
                    stamina -= 10;
                    System.out.println("Stamina: " + stamina);
                    System.out.println(". You quickly slosh your way through the thick snow. The bitter cold bites your face but you shake the feeling off. \n The wolves, realizing that you pose no threat, head deeper into the forest. Eventually, you make it past the mountain and are almost upon the orc camp. Suddenly, you hear an orc patrol walking by...(Choose one: \n\n A. climb the tree and wait for a perfect opportunity to stike. \n B. leap out and fight the orcs. \n C. hide in the bushes and let the orcs pass");
                    String tactic1 = keyboard.nextLine();
                    if (tactic1.equals("A.")) {
                        System.out.println("You quickly climb onto the tree and watch the ground below. Only two orcs are passing below you. \nYou take your " + weaponChoose1 + " and jump down, swinging your weapon with a devastating downward strike. \n The left orc dies instantly and the right orc leaps back in surprise");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("B.")) {
                        System.out.println("You leap out into the open and encounter two orcs. The orcs are stunned by entrance and you dash forward with your " + weaponChoose1 + " ready.");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("C.")){
                        System.out.println("You crouch into the prickly bushes and stay as still as you can. \n The chilling wind howls around you but you force yourself to stay still. \n You patience was worthwhile as five heavily armored orcs stomp across the road.\n When you are certain that the road is clear, you exit the bushes and carefully follow the orcs' trails");
                    }
                } else {
                    stamina -= 5;
                    System.out.println("Stamina: " + stamina);
                    System.out.println(". You prepare yourself for the arduous climb. You grab hold of the rocks. As you climb upward, your sixth sense kick in. You quickly navigate through the mountain with ease. Suddenly, you hear an orc patrol passing by below ...(Choose one: \n\n A. leap onto a nearby tree and strike from above. \n B. charge straight for the orcs. \n C.wait for the orcs to pass by ");
                    String tactic1 = keyboard.nextLine();
                    if (tactic1.equals("A.")) {
                        System.out.println("You quickly climb onto the tree and watch the ground below. Only two orcs are passing below you. \nYou take your " + weaponChoose1 + " and jump down, swinging your weapon with a devastating downward strike. \n The left orc dies instantly and the right orc leaps back in surprise");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("B.")) {
                        System.out.println("You leap out into the open and encounter two orcs. The orcs are stunned by entrance and you dash forward with your " + weaponChoose1 + " ready.");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("C.")){
                        System.out.println("You crouch into the prickly bushes and stay as still as you can. \n The chilling wind howls around you but you force yourself to stay still. \n You patience was worthwhile as five heavily armored orcs stomp across the road.\n When you are certain that the road is clear, you exit the bushes and carefully follow the orcs' trails");
                    }
                }
            } else if (magicChoose1.equals("C.")) {
                //axe with healing abilities
                System.out.println(" heal yourself in an instant. \n\n As you travel on your chestnut-colored horse, you scan your surroundings. Snow covers ground as far as you can see. \nYou have been traveling for days and you are exhausted. However you remind yourself that it is your duty to protect \nothers who fall under the savagery of the orcs. A cold wave of fear courses through your body as you remember the remains of villagers from the previous town. You had \narrived too late and followed the trail the orcs left behind, vowing to avenge the victims.\n Suddenly, a strong smell hits your nose. Sulfur, ashes. The orcs must be nearby!! You scan the sky for any sign of a camp. Sure enough, a trail of black smoke swivels \n in the air about two miles ahead. You urge you horse to move on, only to run into an enormous mountain blocking your way. \nNearby the mountain, you see a pack of wolves, watching your intently, assessing the threat. You get off of your horse and urge it to go back. You could walk around the mountain but concern for any prisoners the orcs might have cloud your mind.(Choose your action: \n A. walk around the mountain. \n B. scale the mountain.");
                String path1 = keyboard.nextLine();
                if (path1.equals("A.")) {
                    stamina -= 10;
                    System.out.println("Stamina: " + stamina);
                    System.out.println(". You quickly slosh your way through the thick snow. The bitter cold bites your face but you shake the feeling off. \n The wolves, realizing that you pose no threat, head deeper into the forest. Eventually, you make it past the mountain and are almost upon the orc camp. Suddenly, you hear an orc patrol walking by...(Choose one: \n\n A. climb the tree and wait for a perfect opportunity to stike. \n B. leap out and fight the orcs. \n C. hide in the bushes and let the orcs pass");
                    String tactic1 = keyboard.nextLine();
                    if (tactic1.equals("A.")) {
                        System.out.println("You quickly climb onto the tree and watch the ground below. Only two orcs are passing below you. \nYou take your " + weaponChoose1 + " and jump down, swinging your weapon with a devastating downward strike. \n The left orc dies instantly and the right orc leaps back in surprise");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("B.")) {
                        System.out.println("You leap out into the open and encounter two orcs. The orcs are stunned by entrance and you dash forward with your " + weaponChoose1 + " ready.");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("C.")){
                        System.out.println("You crouch into the prickly bushes and stay as still as you can. \n The chilling wind howls around you but you force yourself to stay still. \n You patience was worthwhile as five heavily armored orcs stomp across the road.\n When you are certain that the road is clear, you exit the bushes and carefully follow the orcs' trails");
                    }
                } else {
                    stamina -= 15;
                    System.out.println("Stamina: " + stamina);
                    magic -= 5;
                    System.out.println("Magic: " + magic);
                    System.out.println(". You prepare yourself for the arduous climb. You grab hold of the rocks. As you climb upward, you suddenly slip and injure yourself on the jagged rocks and obtain a minor flesh wound. \n However, your healing abilities kick in and you heal the injury. \n You quickly adapt to your situation and make it past the mountain with caution. Suddenly, you hear an orc patrol passing by below ...(Choose one: \n\n A. leap onto a nearby tree and strike from above. \n B. charge straight for the orcs. \n C.wait for the orcs to pass by ");
                    String tactic1 = keyboard.nextLine();
                    if (tactic1.equals("A.")) {
                        System.out.println("You quickly climb onto the tree and watch the ground below. Only two orcs are passing below you. \nYou take your " + weaponChoose1 + " and jump down, swinging your weapon with a devastating downward strike. \n The left orc dies instantly and the right orc leaps back in surprise");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("B.")) {
                        System.out.println("You leap out into the open and encounter two orcs. The orcs are stunned by entrance and you dash forward with your " + weaponChoose1 + " ready.");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("C.")){
                        System.out.println("You crouch into the prickly bushes and stay as still as you can. \n The chilling wind howls around you but you force yourself to stay still. \n You patience was worthwhile as five heavily armored orcs stomp across the road.\n When you are certain that the road is clear, you exit the bushes and carefully follow the orcs' trails");
                    }
                }
            } else if (magicChoose1.equals("D.")) {
                //axe with invisibility
                System.out.println(" cloak yourself with darkness rendering yourself invisible. \n\n As you travel on your chestnut-colored horse, you scan your surroundings. Snow covers ground as far as you can see. \nYou have been traveling for days and you are exhausted. However you remind yourself that it is your duty to protect \nothers who fall under the savagery of the orcs. A cold wave of fear courses through your body as you remember the remains of villagers from the previous town. You had \narrived too late and followed the trail the orcs left behind, vowing to avenge the victims.\n Suddenly, a strong smell hits your nose. Sulfur, ashes. The orcs must be nearby!! You scan the sky for any sign of a camp. Sure enough, a trail of black smoke swivels \n in the air about two miles ahead. You urge you horse to move on, only to run into an enormous mountain blocking your way. \nNearby the mountain, you see a pack of wolves, watching your intently, assessing the threat. You get off of your horse and urge it to go back. You could walk around the mountain but concern for any prisoners the orcs might have cloud your mind.(Choose your action: \n A. walk around the mountain. \n B. scale the mountain.");
                String path1 = keyboard.nextLine();
                if (path1.equals("A.")) {
                    stamina -= 10;
                    System.out.println("Stamina: " + stamina);
                    System.out.println(". You quickly slosh your way through the thick snow. The bitter cold bites your face but you shake the feeling off. \n The wolves, realizing that you pose no threat, head deeper into the forest. Eventually, you make it past the mountain and are almost upon the orc camp. Suddenly, you hear an orc patrol walking by...(Choose one: \n\n A. climb the tree and wait for a perfect opportunity to stike. \n B. leap out and fight the orcs. \n C. hide in the bushes and let the orcs pass. \n D. use your invisibility to take out as many orcs as possible");
                    String tactic1 = keyboard.nextLine();
                    if (tactic1.equals("A.")) {
                        System.out.println("You quickly climb onto the tree and watch the ground below. Only two orcs are passing below you. \nYou take your " + weaponChoose1 + " and jump down, swinging your weapon with a devastating downward strike. \n The left orc dies instantly and the right orc leaps back in surprise");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("B.")) {
                        System.out.println("You leap out into the open and encounter two orcs. The orcs are stunned by entrance and you dash forward with your " + weaponChoose1 + " ready.");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("C.")){
                        System.out.println("You crouch into the prickly bushes and stay as still as you can. \n The chilling wind howls around you but you force yourself to stay still. \n You patience was worthwhile as five heavily armored orcs stomp across the road.\n When you are certain that the road is clear, you exit the bushes and carefully follow the orcs' trails");
                    }
                    else{
                        System.out.println ("Calling upon the power of darkness, your body morphs itself into a dark shadow.\n You propel yourself towards the orcs at speeds orc eyes could never comprehend.\n Seeing only two orcs, you unsheath your " + weaponChoose1 + " and execute the orc on the left.\n An instant later, the other orc met the same fate.\n You search the corpses of the orcs. \n On them were 80 gold, a rusty saw blade, and leather armor. \n\nYou take your loot. Enter '1','2','3',or 'done'");
                        //create arrays for satchel and enemy loots 
                    }
                } else {
                    stamina -= 15;
                    System.out.println("Stamina: " + stamina);
                    health -= 10;
                    System.out.println(". You prepare yourself for the arduous climb. You grab hold of the rocks. As you climb upward, you suddenly slip and injure yourself on the jagged rocks and obtain a minor flesh wound. \n However, you quickly adapt to your situation and make it past the mountain with caution. Suddenly, you hear an orc patrol passing by below ...(Choose one: \n\n A. leap onto a nearby tree and strike from above. \n B. charge straight for the orcs. \n C.wait for the orcs to pass by. \n D. use your invisibility to take out as many orcs as possible ");
                    String tactic1 = keyboard.nextLine();
                    if (tactic1.equals("A.")) {
                        System.out.println("You quickly climb onto the tree and watch the ground below. Only two orcs are passing below you. \nYou take your " + weaponChoose1 + " and jump down, swinging your weapon with a devastating downward strike. \n The left orc dies instantly and the right orc leaps back in surprise");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("B.")) {
                        System.out.println("You leap out into the open and encounter two orcs. The orcs are stunned by entrance and you dash forward with your " + weaponChoose1 + " ready.");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("C.")){
                        System.out.println("You crouch into the prickly bushes and stay as still as you can. \n The chilling wind howls around you but you force yourself to stay still. \n You patience was worthwhile as five heavily armored orcs stomp across the road.\n When you are certain that the road is clear, you exit the bushes and carefully follow the orcs' trails");
                    }
                    else{
                        System.out.println ("Calling upon the power of darkness, your body morphs itself into a dark shadow.\n You propel yourself towards the orcs at speeds orc eyes could never comprehend.\n Seeing only two orcs, you unsheath your " + weaponChoose1 + " and execute the orc on the left.\n An instant later, the other orc met the same fate.\n You search the corpses of the orcs. \n On them were 80 gold, a rusty saw blade, and leather armor. \n\nYou take your loot. Enter '1','2','3',or 'done'");
                        //create arrays for satchel and enemy loots 
                    }
                }
            } else {
                //axe with no magic
                System.out.println(" ... Correction: You don't have any magic abilities. \n\n As you travel on your chestnut-colored horse, you scan your surroundings. Snow covers ground as far as you can see. \nYou have been traveling for days and you are exhausted. However you remind yourself that it is your duty to protect \nothers who fall under the savagery of the orcs. A cold wave of fear courses through your body as you remember the remains of villagers from the previous town. You had \narrived too late and followed the trail the orcs left behind, vowing to avenge the victims.\n Suddenly, a strong smell hits your nose. Sulfur, ashes. The orcs must be nearby!! You scan the sky for any sign of a camp. Sure enough, a trail of black smoke swivels \n in the air about two miles ahead. You urge you horse to move on, only to run into an enormous mountain blocking your way. \nNearby the mountain, you see a pack of wolves, watching your intently, assessing the threat. You get off of your horse and urge it to go back. (Choose your action: \n A. walk around the mountain. \n B. scale the mountain.");
                String path1 = keyboard.nextLine();
                if (path1.equals("A.")) {
                    stamina -= 10;
                    System.out.println("Stamina: " + stamina);
                    System.out.println(". You quickly slosh your way through the thick snow. The bitter cold bites your face but you shake the feeling off. \n The wolves, realizing that you pose no threat, head deeper into the forest. Eventually, you make it past the mountain and are almost upon the orc camp. Suddenly, you hear an orc patrol walking by...(Choose one: \n\n A. climb the tree and wait for a perfect opportunity to stike. \n B. leap out and fight the orcs. \n C. hide in the bushes and let the orcs pass");
                    String tactic1 = keyboard.nextLine();
                    if (tactic1.equals("A.")) {
                        System.out.println("You quickly climb onto the tree and watch the ground below. Only two orcs are passing below you. \nYou take your " + weaponChoose1 + " and jump down, swinging your weapon with a devastating downward strike. \n The left orc dies instantly and the right orc leaps back in surprise");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("B.")) {
                        System.out.println("You leap out into the open and encounter two orcs. The orcs are stunned by entrance and you dash forward with your " + weaponChoose1 + " ready.");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("C.")){
                        System.out.println("You crouch into the prickly bushes and stay as still as you can. \n The chilling wind howls around you but you force yourself to stay still. \n You patience was worthwhile as five heavily armored orcs stomp across the road.\n When you are certain that the road is clear, you exit the bushes and carefully follow the orcs' trails");
                    }
                } else {
                    stamina -= 15;
                    System.out.println("Stamina: " + stamina);
                    health -= 10;
                    System.out.println(". You prepare yourself for the arduous climb. You grab hold of the rocks. As you climb upward, you suddenly slip and injure yourself on the jagged rocks and obtain a minor flesh wound. \n However, you quickly adapt to your situation and make it past the mountain with caution. Suddenly, you hear an orc patrol passing by below ...(Choose one: \n\n A. leap onto a nearby tree and strike from above. \n B. charge straight for the orcs. \n C.wait for the orcs to pass by ");
                    String tactic1 = keyboard.nextLine();
                    if (tactic1.equals("A.")) {
                        System.out.println("You quickly climb onto the tree and watch the ground below. Only two orcs are passing below you. \nYou take your " + weaponChoose1 + " and jump down, swinging your weapon with a devastating downward strike. \n The left orc dies instantly and the right orc leaps back in surprise");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("B.")) {
                        System.out.println("You leap out into the open and encounter two orcs. The orcs are stunned by entrance and you dash forward with your " + weaponChoose1 + " ready.");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("C.")){
                        System.out.println("You crouch into the prickly bushes and stay as still as you can. \n The chilling wind howls around you but you force yourself to stay still. \n You patience was worthwhile as five heavily armored orcs stomp across the road.\n When you are certain that the road is clear, you exit the bushes and carefully follow the orcs' trails");
                    }
                }
            }

        } else if (weaponChoose1.equals("C.")) {
            System.out.println(" stake. You also possess magic capabilities allowing you to...(enter one \n A. communicate with animals \n B. have a sixth sense. \n C. healing abilities. \n D. cloak yourself with darkness rendering yourself invisible.)");
            String magicChoose1 = keyboard.nextLine();

            if (magicChoose1.equals("A.")) {
                //stake with animal communication
                System.out.println(" communicate with animals. \n\n As you travel on your chestnut-colored horse, you scan your surroundings. Snow covers ground as far as you can see. \nYou have been traveling for days and you are exhausted. However you remind yourself that it is your duty to protect \nothers who fall under the savagery of the orcs. A cold wave of fear courses through your body as you remember the remains of villagers from the previous town. You had \narrived too late and followed the trail the orcs left behind, vowing to avenge the victims.\n Suddenly, a strong smell hits your nose. Sulfur, ashes. The orcs must be nearby!! You scan the sky for any sign of a camp. Sure enough, a trail of black smoke swivels \n in the air about two miles ahead. You urge you horse to move on, only to run into an enormous mountain blocking your way. \nNearby the mountain, you see a pack of wolves, watching your intently, assessing the threat. You get off of your horse and urge it to go back. You could walk around the mountain but concern for any prisoners the orcs might have cloud your mind.(Choose your action: \n A. walk around the mountain. \n B. scale the mountain. \n C. ask the wolves for assistance.");
                String path1 = keyboard.nextLine();
                if (path1.equals("A.")) {
                    stamina -= 10;
                    System.out.println("Stamina: " + stamina);
                    System.out.println(". You quickly slosh your way through the thick snow. The bitter cold bites your face but you shake the feeling off. \n The wolves, realizing that you pose no threat, head deeper into the forest. Eventually, you make it past the mountain and are almost upon the orc camp. Suddenly, you hear an orc patrol walking by...(Choose one: \n\n A. climb the tree and wait for a perfect opportunity to stike. \n B. leap out and fight the orcs. \n C. hide in the bushes and let the orcs pass");
                    String tactic1 = keyboard.nextLine();
                    if (tactic1.equals("A.")) {
                        System.out.println("You quickly climb onto the tree and watch the ground below. Only two orcs are passing below you. \nYou take your " + weaponChoose1 + " and jump down, swinging your weapon with a devastating downward strike. \n The left orc dies instantly and the right orc leaps back in surprise");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("B.")) {
                        System.out.println("You leap out into the open and encounter two orcs. The orcs are stunned by entrance and you dash forward with your " + weaponChoose1 + " ready.");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("C.")){
                        System.out.println("You crouch into the prickly bushes and stay as still as you can. \n The chilling wind howls around you but you force yourself to stay still. \n You patience was worthwhile as five heavily armored orcs stomp across the road.\n When you are certain that the road is clear, you exit the bushes and carefully follow the orcs' trails");
                    }
                } else if (path1.equals("C.")) {
                    System.out.println(". You walk to the wolves and raise for hands to show that you pose no threat. \n Steadily, the alpha of the pack approaches you. You ask the alpha for a safe passage through the mountain. \n With no words exchanged, the alpha beckons you to follow it and leads you through a hidden tunnel through the mountain. \n After you make it across, you thank the alpha, who leaves with its pack. Suddenly, you hear an orc patrol walking by...(Choose one: \n\nA. climb a tree and wait for the perfect opportunity to strike. \n B. leap out and fight the orcs. \n C. hide inthe bushes and let the orcs pass");
                    String tactic1 = keyboard.nextLine();
                    if (tactic1.equals("A.")) {
                        System.out.println("You quickly climb onto the tree and watch the ground below. Only two orcs are passing below you. \nYou take your " + weaponChoose1 + " and jump down, swinging your weapon with a devastating downward strike. \n The left orc dies instantly and the right orc leaps back in surprise");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("B.")) {
                        System.out.println("You leap out into the open and encounter two orcs. The orcs are stunned by entrance and you dash forward with your " + weaponChoose1 + " ready.");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("C.")){
                        System.out.println("You crouch into the prickly bushes and stay as still as you can. \n The chilling wind howls around you but you force yourself to stay still. \n You patience was worthwhile as five heavily armored orcs stomp across the road.\n When you are certain that the road is clear, you exit the bushes and carefully follow the orcs' trails");
                    }
                } else {
                    stamina -= 15;
                    System.out.println("Stamina: " + stamina);
                    health -= 10;
                    System.out.println(". You prepare yourself for the arduous climb. You grab hold of the rocks. As you climb upward, you suddenly slip and injure yourself on the jagged rocks and obtain a minor flesh wound. \n However, you quickly adapt to your situation and make it past the mountain with caution. Suddenly, you hear an orc patrol passing by below ...(Choose one: \n\n A. leap onto a nearby tree and strike from above. \n B. charge straight for the orcs. \n C.wait for the orcs to pass by ");
                    String tactic1 = keyboard.nextLine();
                    if (tactic1.equals("A.")) {
                        System.out.println("You quickly climb onto the tree and watch the ground below. Only two orcs are passing below you. \nYou take your " + weaponChoose1 + " and jump down, swinging your weapon with a devastating downward strike. \n The left orc dies instantly and the right orc leaps back in surprise");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("B.")) {
                        System.out.println("You leap out into the open and encounter two orcs. The orcs are stunned by entrance and you dash forward with your " + weaponChoose1 + " ready.");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("C.")){
                        System.out.println("You crouch into the prickly bushes and stay as still as you can. \n The chilling wind howls around you but you force yourself to stay still. \n You patience was worthwhile as five heavily armored orcs stomp across the road.\n When you are certain that the road is clear, you exit the bushes and carefully follow the orcs' trails");
                    }
                }
            } else if (magicChoose1.equals("B.")) {
                //stake with sixth sense
                System.out.println(" have a sixth sense. \n\n As you travel on your chestnut-colored horse, you scan your surroundings. Snow covers ground as far as you can see. \nYou have been traveling for days and you are exhausted. However you remind yourself that it is your duty to protect \nothers who fall under the savagery of the orcs. A cold wave of fear courses through your body as you remember the remains of villagers from the previous town. You had \narrived too late and followed the trail the orcs left behind, vowing to avenge the victims.\n Suddenly, a strong smell hits your nose. Sulfur, ashes. The orcs must be nearby!! You scan the sky for any sign of a camp. Sure enough, a trail of black smoke swivels \n in the air about two miles ahead. You urge you horse to move on, only to run into an enormous mountain blocking your way. \nNearby the mountain, you see a pack of wolves, watching your intently, assessing the threat. You get off of your horse and urge it to go back. You could walk around the mountain but concern for any prisoners the orcs might have cloud your mind.(Choose your action: \n A. walk around the mountain. \n B. scale the mountain.");
                String path1 = keyboard.nextLine();
                if (path1.equals("A.")) {
                    stamina -= 10;
                    System.out.println("Stamina: " + stamina);
                    System.out.println(". You quickly slosh your way through the thick snow. The bitter cold bites your face but you shake the feeling off. \n The wolves, realizing that you pose no threat, head deeper into the forest. Eventually, you make it past the mountain and are almost upon the orc camp. Suddenly, you hear an orc patrol walking by...(Choose one: \n\n A. climb the tree and wait for a perfect opportunity to stike. \n B. leap out and fight the orcs. \n C. hide in the bushes and let the orcs pass");
                    String tactic1 = keyboard.nextLine();
                    if (tactic1.equals("A.")) {
                        System.out.println("You quickly climb onto the tree and watch the ground below. Only two orcs are passing below you. \nYou take your " + weaponChoose1 + " and jump down, swinging your weapon with a devastating downward strike. \n The left orc dies instantly and the right orc leaps back in surprise");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("B.")) {
                        System.out.println("You leap out into the open and encounter two orcs. The orcs are stunned by entrance and you dash forward with your " + weaponChoose1 + " ready.");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("C.")){
                        System.out.println("You crouch into the prickly bushes and stay as still as you can. \n The chilling wind howls around you but you force yourself to stay still. \n You patience was worthwhile as five heavily armored orcs stomp across the road.\n When you are certain that the road is clear, you exit the bushes and carefully follow the orcs' trails");
                    }
                } else {
                    stamina -= 5;
                    System.out.println("Stamina: " + stamina);
                    System.out.println(". You prepare yourself for the arduous climb. You grab hold of the rocks. As you climb upward, your sixth sense kick in \n and make it past the mountain with ease. Suddenly, you hear an orc patrol passing by below ...(Choose one: \n\n A. leap onto a nearby tree and strike from above. \n B. charge straight for the orcs. \n C.wait for the orcs to pass by ");
                    String tactic1 = keyboard.nextLine();
                    if (tactic1.equals("A.")) {
                        System.out.println("You quickly climb onto the tree and watch the ground below. Only two orcs are passing below you. \nYou take your " + weaponChoose1 + " and jump down, swinging your weapon with a devastating downward strike. \n The left orc dies instantly and the right orc leaps back in surprise");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("B.")) {
                        System.out.println("You leap out into the open and encounter two orcs. The orcs are stunned by entrance and you dash forward with your " + weaponChoose1 + " ready.");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("C.")){
                        System.out.println("You crouch into the prickly bushes and stay as still as you can. \n The chilling wind howls around you but you force yourself to stay still. \n You patience was worthwhile as five heavily armored orcs stomp across the road.\n When you are certain that the road is clear, you exit the bushes and carefully follow the orcs' trails");
                    }
                }
            } else if (magicChoose1.equals("C.")) {
                //stake with healing abilities
                System.out.println(" heal yourself in an instant. \n\n As you travel on your chestnut-colored horse, you scan your surroundings. Snow covers ground as far as you can see. \nYou have been traveling for days and you are exhausted. However you remind yourself that it is your duty to protect \nothers who fall under the savagery of the orcs. A cold wave of fear courses through your body as you remember the remains of villagers from the previous town. You had \narrived too late and followed the trail the orcs left behind, vowing to avenge the victims.\n Suddenly, a strong smell hits your nose. Sulfur, ashes. The orcs must be nearby!! You scan the sky for any sign of a camp. Sure enough, a trail of black smoke swivels \n in the air about two miles ahead. You urge you horse to move on, only to run into an enormous mountain blocking your way. \nNearby the mountain, you see a pack of wolves, watching your intently, assessing the threat. You get off of your horse and urge it to go back. You could walk around the mountain but concern for any prisoners the orcs might have cloud your mind.(Choose your action: \n A. walk around the mountain. \n B. scale the mountain.");
                String path1 = keyboard.nextLine();
                if (path1.equals("A.")) {
                    stamina -= 10;
                    System.out.println("Stamina: " + stamina);
                    System.out.println(". You quickly slosh your way through the thick snow. The bitter cold bites your face but you shake the feeling off. \n The wolves, realizing that you pose no threat, head deeper into the forest. Eventually, you make it past the mountain and are almost upon the orc camp. Suddenly, you hear an orc patrol walking by...(Choose one: \n\n A. climb the tree and wait for a perfect opportunity to stike. \n B. leap out and fight the orcs. \n C. hide in the bushes and let the orcs pass");
                    String tactic1 = keyboard.nextLine();
                    if (tactic1.equals("A.")) {
                        System.out.println("You quickly climb onto the tree and watch the ground below. Only two orcs are passing below you. \nYou take your " + weaponChoose1 + " and jump down, swinging your weapon with a devastating downward strike. \n The left orc dies instantly and the right orc leaps back in surprise");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("B.")) {
                        System.out.println("You leap out into the open and encounter two orcs. The orcs are stunned by entrance and you dash forward with your " + weaponChoose1 + " ready.");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("C.")){
                        System.out.println("You crouch into the prickly bushes and stay as still as you can. \n The chilling wind howls around you but you force yourself to stay still. \n You patience was worthwhile as five heavily armored orcs stomp across the road.\n When you are certain that the road is clear, you exit the bushes and carefully follow the orcs' trails");
                    }
                } else {
                    stamina -= 15;
                    System.out.println("Stamina: " + stamina);
                    magic -= 5;
                    System.out.println("Magic: " + magic);
                    System.out.println(". You prepare yourself for the arduous climb. You grab hold of the rocks. As you climb upward, you suddenly slip and injure yourself on the jagged rocks and obtain a minor flesh wound. \n However, your healing abilities kick in and you heal the injury.\n  You quickly adapt to your situation and make it past the mountain with caution. Suddenly, you hear an orc patrol passing by below ...(Choose one: \n\n A. leap onto a nearby tree and strike from above. \n B. charge straight for the orcs. \n C.wait for the orcs to pass by ");
                    String tactic1 = keyboard.nextLine();
                    if (tactic1.equals("A.")) {
                        System.out.println("You quickly climb onto the tree and watch the ground below. Only two orcs are passing below you. \nYou take your " + weaponChoose1 + " and jump down, swinging your weapon with a devastating downward strike. \n The left orc dies instantly and the right orc leaps back in surprise");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("B.")) {
                        System.out.println("You leap out into the open and encounter two orcs. The orcs are stunned by entrance and you dash forward with your " + weaponChoose1 + " ready.");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("C.")){
                        System.out.println("You crouch into the prickly bushes and stay as still as you can. \n The chilling wind howls around you but you force yourself to stay still. \n You patience was worthwhile as five heavily armored orcs stomp across the road.\n When you are certain that the road is clear, you exit the bushes and carefully follow the orcs' trails");
                    }
                }
            } else if (magicChoose1.equals("D.")) {
                //stake with invisibility
                System.out.println(" cloak yourself with darkness rendering yourself invisible. \n\n As you travel on your chestnut-colored horse, you scan your surroundings. Snow covers ground as far as you can see. \nYou have been traveling for days and you are exhausted. However you remind yourself that it is your duty to protect \nothers who fall under the savagery of the orcs. A cold wave of fear courses through your body as you remember the remains of villagers from the previous town. You had \narrived too late and followed the trail the orcs left behind, vowing to avenge the victims.\n Suddenly, a strong smell hits your nose. Sulfur, ashes. The orcs must be nearby!! You scan the sky for any sign of a camp. Sure enough, a trail of black smoke swivels \n in the air about two miles ahead. You urge you horse to move on, only to run into an enormous mountain blocking your way. \nNearby the mountain, you see a pack of wolves, watching your intently, assessing the threat. You get off of your horse and urge it to go back. You could walk around the mountain but concern for any prisoners the orcs might have cloud your mind.(Choose your action: \n A. walk around the mountain. \n B. scale the mountain.");
                String path1 = keyboard.nextLine();
                if (path1.equals("A.")) {
                    stamina -= 10;
                    System.out.println("Stamina: " + stamina);
                    System.out.println(". You quickly slosh your way through the thick snow. The bitter cold bites your face but you shake the feeling off. \n The wolves, realizing that you pose no threat, head deeper into the forest. Eventually, you make it past the mountain and are almost upon the orc camp. Suddenly, you hear an orc patrol walking by...(Choose one: \n\n A. climb the tree and wait for a perfect opportunity to stike. \n B. leap out and fight the orcs. \n C. hide in the bushes and let the orcs pass. \n D. use your invisibility to take out as many orcs as possible");
                    String tactic1 = keyboard.nextLine();
                    if (tactic1.equals("A.")) {
                        System.out.println("You quickly climb onto the tree and watch the ground below. Only two orcs are passing below you. \nYou take your " + weaponChoose1 + " and jump down, swinging your weapon with a devastating downward strike. \n The left orc dies instantly and the right orc leaps back in surprise");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("B.")) {
                        System.out.println("You leap out into the open and encounter two orcs. The orcs are stunned by entrance and you dash forward with your " + weaponChoose1 + " ready.");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("C.")){
                        System.out.println("You crouch into the prickly bushes and stay as still as you can. \n The chilling wind howls around you but you force yourself to stay still. \n You patience was worthwhile as five heavily armored orcs stomp across the road.\n When you are certain that the road is clear, you exit the bushes and carefully follow the orcs' trails");
                    }
                    else{
                        System.out.println ("Calling upon the power of darkness, your body morphs itself into a dark shadow.\n You propel yourself towards the orcs at speeds orc eyes could never comprehend.\n Seeing only two orcs, you unsheath your " + weaponChoose1 + " and execute the orc on the left.\n An instant later, the other orc met the same fate.\n You search the corpses of the orcs. \n On them were 80 gold, a rusty saw blade, and leather armor. \n\nYou take your loot. Enter '1','2','3',or 'done'");
                        //create arrays for satchel and enemy loots 
                    }
                } else {
                    stamina -= 15;
                    System.out.println("Stamina: " + stamina);
                    health -= 10;
                    System.out.println(". You prepare yourself for the arduous climb. You grab hold of the rocks. As you climb upward, you suddenly slip and injure yourself on the jagged rocks and obtain a minor flesh wound. \n However, you quickly adapt to your situation and make it past the mountain with caution. Suddenly, you hear an orc patrol passing by below ...(Choose one: \n\n A. leap onto a nearby tree and strike from above. \n B. charge straight for the orcs. \n C.wait for the orcs to pass by. \n D. use your invisibility to take out as many orcs as possible ");
                    String tactic1 = keyboard.nextLine();
                    if (tactic1.equals("A.")) {
                        System.out.println("You quickly climb onto the tree and watch the ground below. Only two orcs are passing below you. \nYou take your " + weaponChoose1 + " and jump down, swinging your weapon with a devastating downward strike. \n The left orc dies instantly and the right orc leaps back in surprise");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("B.")) {
                        System.out.println("You leap out into the open and encounter two orcs. The orcs are stunned by entrance and you dash forward with your " + weaponChoose1 + " ready.");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("C.")){
                        System.out.println("You crouch into the prickly bushes and stay as still as you can. \n The chilling wind howls around you but you force yourself to stay still. \n You patience was worthwhile as five heavily armored orcs stomp across the road.\n When you are certain that the road is clear, you exit the bushes and carefully follow the orcs' trails");
                    }
                    else{
                        System.out.println ("Calling upon the power of darkness, your body morphs itself into a dark shadow.\n You propel yourself towards the orcs at speeds orc eyes could never comprehend.\n Seeing only two orcs, you unsheath your " + weaponChoose1 + " and execute the orc on the left.\n An instant later, the other orc met the same fate.\n You search the corpses of the orcs. \n On them were 80 gold, a rusty saw blade, and leather armor. \n\nYou take your loot. Enter '1','2','3',or 'done'");
                        //create arrays for satchel and enemy loots 
                    }
                }
            } else {
                //stake with no magic
                System.out.println(" ... Correction: You don't have any magic abilities. \n\n As you travel on your chestnut-colored horse, you scan your surroundings. Snow covers ground as far as you can see. \nYou have been traveling for days and you are exhausted. However you remind yourself that it is your duty to protect \nothers who fall under the savagery of the orcs. A cold wave of fear courses through your body as you remember the remains of villagers from the previous town. You had \narrived too late and followed the trail the orcs left behind, vowing to avenge the victims.\n Suddenly, a strong smell hits your nose. Sulfur, ashes. The orcs must be nearby!! You scan the sky for any sign of a camp. Sure enough, a trail of black smoke swivels \n in the air about two miles ahead. You urge you horse to move on, only to run into an enormous mountain blocking your way. \nNearby the mountain, you see a pack of wolves, watching your intently, assessing the threat. You get off of your horse and urge it to go back. You could walk around the mountain but concern for any prisoners the orcs might have cloud your mind.(Choose your action: \n A. walk around the mountain. \n B. scale the mountain.");
                String path1 = keyboard.nextLine();
                if (path1.equals("A.")) {
                    stamina -= 10;
                    System.out.println("Stamina: " + stamina);
                    System.out.println(". You quickly slosh your way through the thick snow. The bitter cold bites your face but you shake the feeling off. \n The wolves, realizing that you pose no threat, head deeper into the forest. Eventually, you make it past the mountain and are almost upon the orc camp. Suddenly, you hear an orc patrol walking by...(Choose one: \n\n A. climb the tree and wait for a perfect opportunity to stike. \n B. leap out and fight the orcs. \n C. hide in the bushes and let the orcs pass");
                    String tactic1 = keyboard.nextLine();
                    if (tactic1.equals("A.")) {
                        System.out.println("You quickly climb onto the tree and watch the ground below. Only two orcs are passing below you. \nYou take your " + weaponChoose1 + " and jump down, swinging your weapon with a devastating downward strike. \n The left orc dies instantly and the right orc leaps back in surprise");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("B.")) {
                        System.out.println("You leap out into the open and encounter two orcs. The orcs are stunned by entrance and you dash forward with your " + weaponChoose1 + " ready.");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("C.")){
                        System.out.println("You crouch into the prickly bushes and stay as still as you can. \n The chilling wind howls around you but you force yourself to stay still. \n You patience was worthwhile as five heavily armored orcs stomp across the road.\n When you are certain that the road is clear, you exit the bushes and carefully follow the orcs' trails");
                    }
                } else {
                    stamina -= 15;
                    System.out.println("Stamina: " + stamina);
                    health -= 10;
                    System.out.println(". You prepare yourself for the arduous climb. You grab hold of the rocks. As you climb upward, you suddenly slip and injure yourself on the jagged rocks and obtain a minor flesh wound. \n However, you quickly adapt to your situation and make it past the mountain with caution. Suddenly, you hear an orc patrol passing by below ...(Choose one: \n\n A. leap onto a nearby tree and strike from above. \n B. charge straight for the orcs. \n C.wait for the orcs to pass by ");
                    String tactic1 = keyboard.nextLine();
                    if (tactic1.equals("A.")) {
                        System.out.println("You quickly climb onto the tree and watch the ground below. Only two orcs are passing below you. \nYou take your " + weaponChoose1 + " and jump down, swinging your weapon with a devastating downward strike. \n The left orc dies instantly and the right orc leaps back in surprise");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("B.")) {
                        System.out.println("You leap out into the open and encounter two orcs. The orcs are stunned by entrance and you dash forward with your " + weaponChoose1 + " ready.");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("C.")){
                        System.out.println("You crouch into the prickly bushes and stay as still as you can. \n The chilling wind howls around you but you force yourself to stay still. \n You patience was worthwhile as five heavily armored orcs stomp across the road.\n When you are certain that the road is clear, you exit the bushes and carefully follow the orcs' trails");
                    }
                }
            }

        } else if (weaponChoose1.equals("D.")) {
            System.out.println(" mace. You also possess magic capabilities allowing you to...(enter one \n A. communicate with animals \n B. have a sixth sense. \n C. healing abilities. \n D. cloak yourself with darkness rendering yourself invisible.)");
            String magicChoose1 = keyboard.nextLine();

            if (magicChoose1.equals("A.")) {
                //mace with animal communication
                System.out.println(" communicate with animals. \n\n As you travel on your chestnut-colored horse, you scan your surroundings. Snow covers ground as far as you can see. \nYou have been traveling for days and you are exhausted. However you remind yourself that it is your duty to protect \nothers who fall under the savagery of the orcs. A cold wave of fear courses through your body as you remember the remains of villagers from the previous town. You had \narrived too late and followed the trail the orcs left behind, vowing to avenge the victims.\n Suddenly, a strong smell hits your nose. Sulfur, ashes. The orcs must be nearby!! You scan the sky for any sign of a camp. Sure enough, a trail of black smoke swivels \n in the air about two miles ahead. You urge you horse to move on, only to run into an enormous mountain blocking your way. \nNearby the mountain, you see a pack of wolves, watching your intently, assessing the threat. You get off of your horse and urge it to go back. You could walk around the mountain but concern for any prisoners the orcs might have cloud your mind.(Choose your action: \n A. walk around the mountain. \n B. scale the mountain.\n C. ask the wolves for assistance");
                String path1 = keyboard.nextLine();
                if (path1.equals("A.")) {
                    stamina -= 10;
                    System.out.println("Stamina: " + stamina);
                    System.out.println(". You quickly slosh your way through the thick snow. The bitter cold bites your face but you shake the feeling off. \n The wolves, realizing that you pose no threat, head deeper into the forest. Eventually, you make it past the mountain and are almost upon the orc camp. Suddenly, you hear an orc patrol walking by...(Choose one: \n\n A. climb the tree and wait for a perfect opportunity to stike. \n B. leap out and fight the orcs. \n C. hide in the bushes and let the orcs pass");
                    String tactic1 = keyboard.nextLine();
                    if (tactic1.equals("A.")) {
                        System.out.println("You quickly climb onto the tree and watch the ground below. Only two orcs are passing below you. \nYou take your " + weaponChoose1 + " and jump down, swinging your weapon with a devastating downward strike. \n The left orc dies instantly and the right orc leaps back in surprise");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("B.")) {
                        System.out.println("You leap out into the open and encounter two orcs. The orcs are stunned by entrance and you dash forward with your " + weaponChoose1 + " ready.");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("C.")){
                        System.out.println("You crouch into the prickly bushes and stay as still as you can. \n The chilling wind howls around you but you force yourself to stay still. \n You patience was worthwhile as five heavily armored orcs stomp across the road.\n When you are certain that the road is clear, you exit the bushes and carefully follow the orcs' trails");
                    }
                } else if (path1.equals("C.")) {
                    System.out.println(". You walk to the wolves and raise for hands to show that you pose no threat. \n Steadily, the alpha of the pack approaches you. You ask the alpha for a safe passage through the mountain. \n With no words exchanged, the alpha beckons you to follow it and leads you through a hidden tunnel through the mountain. \n After you make it across, you thank the alpha, who leaves with its pack. Suddenly, you hear an orc patrol walking by...(Choose one: \n\nA. climb a tree and wait for the perfect opportunity to strike. \n B. leap out and fight the orcs. \n C. hide inthe bushes and let the orcs pass");
                    String tactic1 = keyboard.nextLine();
                    if (tactic1.equals("A.")) {
                        System.out.println("You quickly climb onto the tree and watch the ground below. Only two orcs are passing below you. \nYou take your " + weaponChoose1 + " and jump down, swinging your weapon with a devastating downward strike. \n The left orc dies instantly and the right orc leaps back in surprise");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("B.")) {
                        System.out.println("You leap out into the open and encounter two orcs. The orcs are stunned by entrance and you dash forward with your " + weaponChoose1 + " ready.");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("C.")){
                        System.out.println("You crouch into the prickly bushes and stay as still as you can. \n The chilling wind howls around you but you force yourself to stay still. \n You patience was worthwhile as five heavily armored orcs stomp across the road.\n When you are certain that the road is clear, you exit the bushes and carefully follow the orcs' trails");
                    }
                } else {
                    stamina -= 15;
                    System.out.println("Stamina: " + stamina);
                    health -= 10;
                    System.out.println(". You prepare yourself for the arduous climb. You grab hold of the rocks. As you climb upward, you suddenly slip and injure yourself on the jagged rocks and obtain a minor flesh wound. \n However, you quickly adapt to your situation and make it past the mountain with caution. Suddenly, you hear an orc patrol passing by below ...(Choose one: \n\n A. leap onto a nearby tree and strike from above. \n B. charge straight for the orcs. \n C.wait for the orcs to pass by ");
                    String tactic1 = keyboard.nextLine();
                    if (tactic1.equals("A.")) {
                        System.out.println("You quickly climb onto the tree and watch the ground below. Only two orcs are passing below you. \nYou take your " + weaponChoose1 + " and jump down, swinging your weapon with a devastating downward strike. \n The left orc dies instantly and the right orc leaps back in surprise");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("B.")) {
                        System.out.println("You leap out into the open and encounter two orcs. The orcs are stunned by entrance and you dash forward with your " + weaponChoose1 + " ready.");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("C.")){
                        System.out.println("You crouch into the prickly bushes and stay as still as you can. \n The chilling wind howls around you but you force yourself to stay still. \n You patience was worthwhile as five heavily armored orcs stomp across the road.\n When you are certain that the road is clear, you exit the bushes and carefully follow the orcs' trails");
                    }
                }
            } else if (magicChoose1.equals("B.")) {
                //mace with sixth sense
                System.out.println(" have a sixth sense.\n\n As you travel on your chestnut-colored horse, you scan your surroundings. Snow covers ground as far as you can see. \nYou have been traveling for days and you are exhausted. However you remind yourself that it is your duty to protect \nothers who fall under the savagery of the orcs. A cold wave of fear courses through your body as you remember the remains of villagers from the previous town. You had \narrived too late and followed the trail the orcs left behind, vowing to avenge the victims.\n Suddenly, a strong smell hits your nose. Sulfur, ashes. The orcs must be nearby!! You scan the sky for any sign of a camp. Sure enough, a trail of black smoke swivels \n in the air about two miles ahead. You urge you horse to move on, only to run into an enormous mountain blocking your way. \nNearby the mountain, you see a pack of wolves, watching your intently, assessing the threat. You get off of your horse and urge it to go back. You could walk around the mountain but concern for any prisoners the orcs might have cloud your mind.(Choose your action: \n A. walk around the mountain. \n B. scale the mountain.");
                String path1 = keyboard.nextLine();
                if (path1.equals("A.")) {
                    stamina -= 10;
                    System.out.println("Stamina: " + stamina);
                    System.out.println(". You quickly slosh your way through the thick snow. The bitter cold bites your face but you shake the feeling off. \n The wolves, realizing that you pose no threat, head deeper into the forest. Eventually, you make it past the mountain and are almost upon the orc camp. Suddenly, you hear an orc patrol walking by...(Choose one: \n\n A. climb the tree and wait for a perfect opportunity to stike. \n B. leap out and fight the orcs. \n C. hide in the bushes and let the orcs pass");
                    String tactic1 = keyboard.nextLine();
                    if (tactic1.equals("A.")) {
                        System.out.println("You quickly climb onto the tree and watch the ground below. Only two orcs are passing below you. \nYou take your " + weaponChoose1 + " and jump down, swinging your weapon with a devastating downward strike. \n The left orc dies instantly and the right orc leaps back in surprise");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("B.")) {
                        System.out.println("You leap out into the open and encounter two orcs. The orcs are stunned by entrance and you dash forward with your " + weaponChoose1 + " ready.");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("C.")){
                        System.out.println("You crouch into the prickly bushes and stay as still as you can. \n The chilling wind howls around you but you force yourself to stay still. \n You patience was worthwhile as five heavily armored orcs stomp across the road.\n When you are certain that the road is clear, you exit the bushes and carefully follow the orcs' trails");
                    }
                } else {
                    stamina -= 5;
                    System.out.println("Stamina: " + stamina);
                    System.out.println(". You prepare yourself for the arduous climb. You grab hold of the rocks. As you climb upward, your sixth sense\n kicks in and you make it past the mountain with ease. Suddenly, you hear an orc patrol passing by below ...(Choose one: \n\n A. leap onto a nearby tree and strike from above. \n B. charge straight for the orcs. \n C.wait for the orcs to pass by ");
                    String tactic1 = keyboard.nextLine();
                    if (tactic1.equals("A.")) {
                        System.out.println("You quickly climb onto the tree and watch the ground below. Only two orcs are passing below you. \nYou take your " + weaponChoose1 + " and jump down, swinging your weapon with a devastating downward strike. \n The left orc dies instantly and the right orc leaps back in surprise");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("B.")) {
                        System.out.println("You leap out into the open and encounter two orcs. The orcs are stunned by entrance and you dash forward with your " + weaponChoose1 + " ready.");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("C.")){
                        System.out.println("You crouch into the prickly bushes and stay as still as you can. \n The chilling wind howls around you but you force yourself to stay still. \n You patience was worthwhile as five heavily armored orcs stomp across the road.\n When you are certain that the road is clear, you exit the bushes and carefully follow the orcs' trails");
                    }
                }
            } else if (magicChoose1.equals("C.")) {
                //mace with healing abilities
                System.out.println(" heal yourself in an instant. \n\n As you travel on your chestnut-colored horse, you scan your surroundings. Snow covers ground as far as you can see. \nYou have been traveling for days and you are exhausted. However you remind yourself that it is your duty to protect \nothers who fall under the savagery of the orcs. A cold wave of fear courses through your body as you remember the remains of villagers from the previous town. You had \narrived too late and followed the trail the orcs left behind, vowing to avenge the victims.\n Suddenly, a strong smell hits your nose. Sulfur, ashes. The orcs must be nearby!! You scan the sky for any sign of a camp. Sure enough, a trail of black smoke swivels \n in the air about two miles ahead. You urge you horse to move on, only to run into an enormous mountain blocking your way. \nNearby the mountain, you see a pack of wolves, watching your intently, assessing the threat. You get off of your horse and urge it to go back. You could walk around the mountain but concern for any prisoners the orcs might have cloud your mind.(Choose your action: \n A. walk around the mountain. \n B. scale the mountain.");
                String path1 = keyboard.nextLine();
                if (path1.equals("A.")) {
                    stamina -= 10;
                    System.out.println("Stamina: " + stamina);
                    System.out.println(". You quickly slosh your way through the thick snow. The bitter cold bites your face but you shake the feeling off. \n The wolves, realizing that you pose no threat, head deeper into the forest. Eventually, you make it past the mountain and are almost upon the orc camp. Suddenly, you hear an orc patrol walking by...(Choose one: \n\n A. climb the tree and wait for a perfect opportunity to stike. \n B. leap out and fight the orcs. \n C. hide in the bushes and let the orcs pass");
                    String tactic1 = keyboard.nextLine();
                    if (tactic1.equals("A.")) {
                        System.out.println("You quickly climb onto the tree and watch the ground below. Only two orcs are passing below you. \nYou take your " + weaponChoose1 + " and jump down, swinging your weapon with a devastating downward strike. \n The left orc dies instantly and the right orc leaps back in surprise");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("B.")) {
                        System.out.println("You leap out into the open and encounter two orcs. The orcs are stunned by entrance and you dash forward with your " + weaponChoose1 + " ready.");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("C.")){
                        System.out.println("You crouch into the prickly bushes and stay as still as you can. \n The chilling wind howls around you but you force yourself to stay still. \n You patience was worthwhile as five heavily armored orcs stomp across the road.\n When you are certain that the road is clear, you exit the bushes and carefully follow the orcs' trails");
                    }
                } else {
                    stamina -= 15;
                    System.out.println("Stamina: " + stamina);
                    magic -= 5;
                    System.out.println("Magic: " + magic);
                    System.out.println(". You prepare yourself for the arduous climb. You grab hold of the rocks. As you climb upward, you suddenly slip and injure yourself on the jagged rocks and obtain a minor flesh wound. \n However, your healing abilities kick in and you heal the injury. \nYou quickly adapt to your situation and make it past the mountain with caution. Suddenly, you hear an orc patrol passing by below ...(Choose one: \n\n A. leap onto a nearby tree and strike from above. \n B. charge straight for the orcs. \n C.wait for the orcs to pass by ");
                    String tactic1 = keyboard.nextLine();
                    if (tactic1.equals("A.")) {
                        System.out.println("You quickly climb onto the tree and watch the ground below. Only two orcs are passing below you. \nYou take your " + weaponChoose1 + " and jump down, swinging your weapon with a devastating downward strike. \n The left orc dies instantly and the right orc leaps back in surprise");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("B.")) {
                        System.out.println("You leap out into the open and encounter two orcs. The orcs are stunned by entrance and you dash forward with your " + weaponChoose1 + " ready.");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("C.")){
                        System.out.println("You crouch into the prickly bushes and stay as still as you can. \n The chilling wind howls around you but you force yourself to stay still. \n You patience was worthwhile as five heavily armored orcs stomp across the road.\n When you are certain that the road is clear, you exit the bushes and carefully follow the orcs' trails");
                    }
                }
            } else if (magicChoose1.equals("D.")) {
                //mace with invisibility
                System.out.println(" cloak yourself with darkness rendering yourself invisible. \n\n As you travel on your chestnut-colored horse, you scan your surroundings. Snow covers ground as far as you can see. \nYou have been traveling for days and you are exhausted. However you remind yourself that it is your duty to protect \nothers who fall under the savagery of the orcs. A cold wave of fear courses through your body as you remember the remains of villagers from the previous town. You had \narrived too late and followed the trail the orcs left behind, vowing to avenge the victims.\n Suddenly, a strong smell hits your nose. Sulfur, ashes. The orcs must be nearby!! You scan the sky for any sign of a camp. Sure enough, a trail of black smoke swivels \n in the air about two miles ahead. You urge you horse to move on, only to run into an enormous mountain blocking your way. \nNearby the mountain, you see a pack of wolves, watching your intently, assessing the threat. You get off of your horse and urge it to go back. You could walk around the mountain but concern for any prisoners the orcs might have cloud your mind.(Choose your action: \n A. walk around the mountain. \n B. scale the mountain.");
                String path1 = keyboard.nextLine();
                if (path1.equals("A.")) {
                    stamina -= 10;
                    System.out.println("Stamina: " + stamina);
                    System.out.println(". You quickly slosh your way through the thick snow. The bitter cold bites your face but you shake the feeling off. \n The wolves, realizing that you pose no threat, head deeper into the forest. Eventually, you make it past the mountain and are almost upon the orc camp. Suddenly, you hear an orc patrol walking by...(Choose one: \n\n A. climb the tree and wait for a perfect opportunity to stike. \n B. leap out and fight the orcs. \n C. hide in the bushes and let the orcs pass. \n D. use your invisibility to take out as many orcs as possible");
                    String tactic1 = keyboard.nextLine();
                    if (tactic1.equals("A.")) {
                        System.out.println("You quickly climb onto the tree and watch the ground below. Only two orcs are passing below you. \nYou take your " + weaponChoose1 + " and jump down, swinging your weapon with a devastating downward strike. \n The left orc dies instantly and the right orc leaps back in surprise");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("B.")) {
                        System.out.println("You leap out into the open and encounter two orcs. The orcs are stunned by entrance and you dash forward with your " + weaponChoose1 + " ready.");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("C.")){
                        System.out.println("You crouch into the prickly bushes and stay as still as you can. \n The chilling wind howls around you but you force yourself to stay still. \n You patience was worthwhile as five heavily armored orcs stomp across the road.\n When you are certain that the road is clear, you exit the bushes and carefully follow the orcs' trails");
                    }
                    else{
                        System.out.println ("Calling upon the power of darkness, your body morphs itself into a dark shadow.\n You propel yourself towards the orcs at speeds orc eyes could never comprehend.\n Seeing only two orcs, you unsheath your " + weaponChoose1 + " and execute the orc on the left.\n An instant later, the other orc met the same fate.\n You search the corpses of the orcs. \n On them were 80 gold, a rusty saw blade, and leather armor. \n\nYou take your loot. Enter '1','2','3',or 'done'");
                        //create arrays for satchel and enemy loots 
                    }
                } else {
                    stamina -= 15;
                    System.out.println("Stamina: " + stamina);
                    health -= 10;
                    System.out.println(". You prepare yourself for the arduous climb. You grab hold of the rocks. As you climb upward, you suddenly slip and injure yourself on the jagged rocks and obtain a minor flesh wound. \n However, you quickly adapt to your situation and make it past the mountain with caution. Suddenly, you hear an orc patrol passing by below ...(Choose one: \n\n A. leap onto a nearby tree and strike from above. \n B. charge straight for the orcs. \n C.wait for the orcs to pass by. \n D. use your invisibility to take out as many orcs as possible ");
                    String tactic1 = keyboard.nextLine();
                    if (tactic1.equals("A.")) {
                        System.out.println("You quickly climb onto the tree and watch the ground below. Only two orcs are passing below you. \nYou take your " + weaponChoose1 + " and jump down, swinging your weapon with a devastating downward strike. \n The left orc dies instantly and the right orc leaps back in surprise");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("B.")) {
                        System.out.println("You leap out into the open and encounter two orcs. The orcs are stunned by entrance and you dash forward with your " + weaponChoose1 + " ready.");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("C.")){
                        System.out.println("You crouch into the prickly bushes and stay as still as you can. \n The chilling wind howls around you but you force yourself to stay still. \n You patience was worthwhile as five heavily armored orcs stomp across the road.\n When you are certain that the road is clear, you exit the bushes and carefully follow the orcs' trails");
                    }
                    else{
                        System.out.println ("Calling upon the power of darkness, your body morphs itself into a dark shadow.\n You propel yourself towards the orcs at speeds orc eyes could never comprehend.\n Seeing only two orcs, you unsheath your " + weaponChoose1 + " and execute the orc on the left.\n An instant later, the other orc met the same fate.\n You search the corpses of the orcs. \n On them were 80 gold, a rusty saw blade, and leather armor. \n\nYou take your loot. Enter '1','2','3',or 'done'");
                        //create arrays for satchel and enemy loots 
                    }
                }
            } else {
                //mace with no magic
                System.out.println(" ... Correction: You don't have any magic abilities. \n\n As you travel on your chestnut-colored horse, you scan your surroundings. Snow covers ground as far as you can see. \nYou have been traveling for days and you are exhausted. However you remind yourself that it is your duty to protect \nothers who fall under the savagery of the orcs. A cold wave of fear courses through your body as you remember the remains of villagers from the previous town. You had \narrived too late and followed the trail the orcs left behind, vowing to avenge the victims.\n Suddenly, a strong smell hits your nose. Sulfur, ashes. The orcs must be nearby!! You scan the sky for any sign of a camp. Sure enough, a trail of black smoke swivels \n in the air about two miles ahead. You urge you horse to move on, only to run into an enormous mountain blocking your way. \nNearby the mountain, you see a pack of wolves, watching your intently, assessing the threat. You get off of your horse and urge it to go back. You could walk around the mountain but concern for any prisoners the orcs might have cloud your mind.(Choose your action: \n A. walk around the mountain. \n B. scale the mountain.");
                String path1 = keyboard.nextLine();
                if (path1.equals("A.")) {
                    stamina -= 10;
                    System.out.println("Stamina: " + stamina);
                    System.out.println(". You quickly slosh your way through the thick snow. The bitter cold bites your face but you shake the feeling off. \n The wolves, realizing that you pose no threat, head deeper into the forest. Eventually, you make it past the mountain and are almost upon the orc camp. Suddenly, you hear an orc patrol walking by...(Choose one: \n\n A. climb the tree and wait for a perfect opportunity to stike. \n B. leap out and fight the orcs. \n C. hide in the bushes and let the orcs pass");
                    String tactic1 = keyboard.nextLine();
                    if (tactic1.equals("A.")) {
                        System.out.println("You quickly climb onto the tree and watch the ground below. Only two orcs are passing below you. \nYou take your " + weaponChoose1 + " and jump down, swinging your weapon with a devastating downward strike. \n The left orc dies instantly and the right orc leaps back in surprise");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("B.")) {
                        System.out.println("You leap out into the open and encounter two orcs. The orcs are stunned by entrance and you dash forward with your " + weaponChoose1 + " ready.");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("C.")){
                        System.out.println("You crouch into the prickly bushes and stay as still as you can. \n The chilling wind howls around you but you force yourself to stay still. \n You patience was worthwhile as five heavily armored orcs stomp across the road.\n When you are certain that the road is clear, you exit the bushes and carefully follow the orcs' trails");
                    }
                } else {
                    stamina -= 15;
                    System.out.println("Stamina: " + stamina);
                    health -= 10;
                    System.out.println(". You prepare yourself for the arduous climb. You grab hold of the rocks. As you climb upward, you suddenly slip and injure yourself on the jagged rocks and obtain a minor flesh wound. \n However, you quickly adapt to your situation and make it past the mountain with caution. Suddenly, you hear an orc patrol passing by below ...(Choose one: \n\n A. leap onto a nearby tree and strike from above. \n B. charge straight for the orcs. \n C.wait for the orcs to pass by ");
                    String tactic1 = keyboard.nextLine();
                    if (tactic1.equals("A.")) {
                        System.out.println("You quickly climb onto the tree and watch the ground below. Only two orcs are passing below you. \nYou take your " + weaponChoose1 + " and jump down, swinging your weapon with a devastating downward strike. \n The left orc dies instantly and the right orc leaps back in surprise");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("B.")) {
                        System.out.println("You leap out into the open and encounter two orcs. The orcs are stunned by entrance and you dash forward with your " + weaponChoose1 + " ready.");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("C.")){
                        System.out.println("You crouch into the prickly bushes and stay as still as you can. \n The chilling wind howls around you but you force yourself to stay still. \n You patience was worthwhile as five heavily armored orcs stomp across the road.\n When you are certain that the road is clear, you exit the bushes and carefully follow the orcs' trails");
                    }
                }
            }

        } else {
            System.out.println(" hands. You also possess magic capabilities allowing you to...(enter one \n A. communicate with animals \n B. have a sixth sense. \n C. healing abilities. \n D. cloak yourself with darkness rendering yourself invisible.)");
            String magicChoose1 = keyboard.nextLine();

            if (magicChoose1.equals("A.")) {
                //hands and animal communication
                System.out.println(" communicate with animals. \n\n As you travel on your chestnut-colored horse, you scan your surroundings. Snow covers ground as far as you can see. \nYou have been traveling for days and you are exhausted. However you remind yourself that it is your duty to protect \nothers who fall under the savagery of the orcs. A cold wave of fear courses through your body as you remember the remains of villagers from the previous town. You had \narrived too late and followed the trail the orcs left behind, vowing to avenge the victims.\n Suddenly, a strong smell hits your nose. Sulfur, ashes. The orcs must be nearby!! You scan the sky for any sign of a camp. Sure enough, a trail of black smoke swivels \n in the air about two miles ahead. You urge you horse to move on, only to run into an enormous mountain blocking your way. \nNearby the mountain, you see a pack of wolves, watching your intently, assessing the threat. You get off of your horse and urge it to go back. You could walk around the mountain but concern for any prisoners the orcs might have cloud your mind.(Choose your action: \n A. walk around the mountain. \n B. scale the mountain.\n C. ask the wolves for assistance");
                String path1 = keyboard.nextLine();
                if (path1.equals("A.")) {
                    stamina -= 10;
                    System.out.println("Stamina: " + stamina);
                    System.out.println(". You quickly slosh your way through the thick snow. The bitter cold bites your face but you shake the feeling off. \n The wolves, realizing that you pose no threat, head deeper into the forest. Eventually, you make it past the mountain and are almost upon the orc camp. Suddenly, you hear an orc patrol walking by...(Choose one: \n\n A. climb the tree and wait for a perfect opportunity to stike. \n B. leap out and fight the orcs. \n C. hide in the bushes and let the orcs pass");
                    String tactic1 = keyboard.nextLine();
                    if (tactic1.equals("A.")) {
                        System.out.println("You quickly climb onto the tree and watch the ground below. Only two orcs are passing below you. \nYou take your " + weaponChoose1 + " and jump down, swinging your weapon with a devastating downward strike. \n The left orc dies instantly and the right orc leaps back in surprise");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("B.")) {
                        System.out.println("You leap out into the open and encounter two orcs. The orcs are stunned by entrance and you dash forward with your " + weaponChoose1 + " ready.");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("C.")){
                        System.out.println("You crouch into the prickly bushes and stay as still as you can. \n The chilling wind howls around you but you force yourself to stay still. \n You patience was worthwhile as five heavily armored orcs stomp across the road.\n When you are certain that the road is clear, you exit the bushes and carefully follow the orcs' trails");
                    }
                } else if (path1.equals("C.")) {
                    System.out.println(". You walk to the wolves and raise for hands to show that you pose no threat. \n Steadily, the alpha of the pack approaches you. You ask the alpha for a safe passage through the mountain. \n With no words exchanged, the alpha beckons you to follow it and leads you through a hidden tunnel through the mountain. \n After you make it across, you thank the alpha, who leaves with its pack. Suddenly, you hear an orc patrol walking by...(Choose one: \n\nA. climb a tree and wait for the perfect opportunity to strike. \n B. leap out and fight the orcs. \n C. hide inthe bushes and let the orcs pass");
                    String tactic1 = keyboard.nextLine();
                    if (tactic1.equals("A.")) {
                        System.out.println("You quickly climb onto the tree and watch the ground below. Only two orcs are passing below you. \nYou take your " + weaponChoose1 + " and jump down, swinging your weapon with a devastating downward strike. \n The left orc dies instantly and the right orc leaps back in surprise");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("B.")) {
                        System.out.println("You leap out into the open and encounter two orcs. The orcs are stunned by entrance and you dash forward with your " + weaponChoose1 + " ready.");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("C.")){
                        System.out.println("You crouch into the prickly bushes and stay as still as you can. \n The chilling wind howls around you but you force yourself to stay still. \n You patience was worthwhile as five heavily armored orcs stomp across the road.\n When you are certain that the road is clear, you exit the bushes and carefully follow the orcs' trails");
                    }
                } else {
                    stamina -= 15;
                    System.out.println("Stamina: " + stamina);
                    health -= 10;
                    System.out.println(". You prepare yourself for the arduous climb. You grab hold of the rocks. As you climb upward, you suddenly slip and injure yourself on the jagged rocks and obtain a minor flesh wound. \n However, you quickly adapt to your situation and make it past the mountain with caution. Suddenly, you hear an orc patrol passing by below ...(Choose one: \n\n A. leap onto a nearby tree and strike from above. \n B. charge straight for the orcs. \n C.wait for the orcs to pass by ");
                    String tactic1 = keyboard.nextLine();
                    if (tactic1.equals("A.")) {
                        System.out.println("You quickly climb onto the tree and watch the ground below. Only two orcs are passing below you. \nYou take your " + weaponChoose1 + " and jump down, swinging your weapon with a devastating downward strike. \n The left orc dies instantly and the right orc leaps back in surprise");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("B.")) {
                        System.out.println("You leap out into the open and encounter two orcs. The orcs are stunned by entrance and you dash forward with your " + weaponChoose1 + " ready.");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("C.")){
                        System.out.println("You crouch into the prickly bushes and stay as still as you can. \n The chilling wind howls around you but you force yourself to stay still. \n You patience was worthwhile as five heavily armored orcs stomp across the road.\n When you are certain that the road is clear, you exit the bushes and carefully follow the orcs' trails");
                    }
                }
            } else if (magicChoose1.equals("B.")) {
                //hands and sixth sense
                System.out.println(" have a sixth sense. \n\n As you travel on your chestnut-colored horse, you scan your surroundings. Snow covers ground as far as you can see. \nYou have been traveling for days and you are exhausted. However you remind yourself that it is your duty to protect \nothers who fall under the savagery of the orcs. A cold wave of fear courses through your body as you remember the remains of villagers from the previous town. You had \narrived too late and followed the trail the orcs left behind, vowing to avenge the victims.\n Suddenly, a strong smell hits your nose. Sulfur, ashes. The orcs must be nearby!! You scan the sky for any sign of a camp. Sure enough, a trail of black smoke swivels \n in the air about two miles ahead. You urge you horse to move on, only to run into an enormous mountain blocking your way. \nNearby the mountain, you see a pack of wolves, watching your intently, assessing the threat. You get off of your horse and urge it to go back. You could walk around the mountain but concern for any prisoners the orcs might have cloud your mind.(Choose your action: \n A. walk around the mountain. \n B. scale the mountain.");
                String path1 = keyboard.nextLine();
                if (path1.equals("A.")) {
                    stamina -= 10;
                    System.out.println("Stamina: " + stamina);
                    System.out.println(". You quickly slosh your way through the thick snow. The bitter cold bites your face but you shake the feeling off. \n The wolves, realizing that you pose no threat, head deeper into the forest. Eventually, you make it past the mountain and are almost upon the orc camp. Suddenly, you hear an orc patrol walking by...(Choose one: \n\n A. climb the tree and wait for a perfect opportunity to stike. \n B. leap out and fight the orcs. \n C. hide in the bushes and let the orcs pass");
                    String tactic1 = keyboard.nextLine();
                    if (tactic1.equals("A.")) {
                        System.out.println("You quickly climb onto the tree and watch the ground below. Only two orcs are passing below you. \nYou take your " + weaponChoose1 + " and jump down, swinging your weapon with a devastating downward strike. \n The left orc dies instantly and the right orc leaps back in surprise");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("B.")) {
                        System.out.println("You leap out into the open and encounter two orcs. The orcs are stunned by entrance and you dash forward with your " + weaponChoose1 + " ready.");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("C.")){
                        System.out.println("You crouch into the prickly bushes and stay as still as you can. \n The chilling wind howls around you but you force yourself to stay still. \n You patience was worthwhile as five heavily armored orcs stomp across the road.\n When you are certain that the road is clear, you exit the bushes and carefully follow the orcs' trails");
                    }
                } else {
                    stamina -= 5;
                    System.out.println("Stamina: " + stamina);
                    System.out.println(". You prepare yourself for the arduous climb. You grab hold of the rocks. As you climb upward, your sixth sense kicks in and you make it past the mountain with ease. Suddenly, you hear an orc patrol passing by below ...(Choose one: \n\n A. leap onto a nearby tree and strike from above. \n B. charge straight for the orcs. \n C.wait for the orcs to pass by ");
                    String tactic1 = keyboard.nextLine();
                    if (tactic1.equals("A.")) {
                        System.out.println("You quickly climb onto the tree and watch the ground below. Only two orcs are passing below you. \nYou take your " + weaponChoose1 + " and jump down, swinging your weapon with a devastating downward strike. \n The left orc dies instantly and the right orc leaps back in surprise");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("B.")) {
                        System.out.println("You leap out into the open and encounter two orcs. The orcs are stunned by entrance and you dash forward with your " + weaponChoose1 + " ready.");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("C.")){
                        System.out.println("You crouch into the prickly bushes and stay as still as you can. \n The chilling wind howls around you but you force yourself to stay still. \n You patience was worthwhile as five heavily armored orcs stomp across the road.\n When you are certain that the road is clear, you exit the bushes and carefully follow the orcs' trails");
                    }
                }
            } else if (magicChoose1.equals("C.")) {
                //hands and healing abilities
                System.out.println(" heal yourself in an instant. \n\n As you travel on your chestnut-colored horse, you scan your surroundings. Snow covers ground as far as you can see. \nYou have been traveling for days and you are exhausted. However you remind yourself that it is your duty to protect \nothers who fall under the savagery of the orcs. A cold wave of fear courses through your body as you remember the remains of villagers from the previous town. You had \narrived too late and followed the trail the orcs left behind, vowing to avenge the victims.\n Suddenly, a strong smell hits your nose. Sulfur, ashes. The orcs must be nearby!! You scan the sky for any sign of a camp. Sure enough, a trail of black smoke swivels \n in the air about two miles ahead. You urge you horse to move on, only to run into an enormous mountain blocking your way. \nNearby the mountain, you see a pack of wolves, watching your intently, assessing the threat. You get off of your horse and urge it to go back. You could walk around the mountain but concern for any prisoners the orcs might have cloud your mind.(Choose your action: \n A. walk around the mountain. \n B. scale the mountain.");
                String path1 = keyboard.nextLine();
                if (path1.equals("A.")) {
                    stamina -= 10;
                    System.out.println("Stamina: " + stamina);
                    System.out.println(". You quickly slosh your way through the thick snow. The bitter cold bites your face but you shake the feeling off. \n The wolves, realizing that you pose no threat, head deeper into the forest. Eventually, you make it past the mountain and are almost upon the orc camp. Suddenly, you hear an orc patrol walking by...(Choose one: \n\n A. climb the tree and wait for a perfect opportunity to stike. \n B. leap out and fight the orcs. \n C. hide in the bushes and let the orcs pass");
                    String tactic1 = keyboard.nextLine();
                    if (tactic1.equals("A.")) {
                        System.out.println("You quickly climb onto the tree and watch the ground below. Only two orcs are passing below you. \nYou take your " + weaponChoose1 + " and jump down, swinging your weapon with a devastating downward strike. \n The left orc dies instantly and the right orc leaps back in surprise");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("B.")) {
                        System.out.println("You leap out into the open and encounter two orcs. The orcs are stunned by entrance and you dash forward with your " + weaponChoose1 + " ready.");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("C.")){
                        System.out.println("You crouch into the prickly bushes and stay as still as you can. \n The chilling wind howls around you but you force yourself to stay still. \n You patience was worthwhile as five heavily armored orcs stomp across the road.\n When you are certain that the road is clear, you exit the bushes and carefully follow the orcs' trails");
                    }
                } else {
                    stamina -= 15;
                    System.out.println("Stamina: " + stamina);
                    magic -= 5;
                    System.out.println("Magic: " + magic);
                    System.out.println(". You prepare yourself for the arduous climb. You grab hold of the rocks. As you climb upward, you suddenly slip and injure yourself on the jagged rocks and obtain a minor flesh wound. \n However, your healing abilities kick in and you heal the injury.\n You quickly adapt to your situation and make it past the mountain with caution. Suddenly, you hear an orc patrol passing by below ...(Choose one: \n\n A. leap onto a nearby tree and strike from above. \n B. charge straight for the orcs. \n C.wait for the orcs to pass by ");
                    String tactic1 = keyboard.nextLine();
                    if (tactic1.equals("A.")) {
                        System.out.println("You quickly climb onto the tree and watch the ground below. Only two orcs are passing below you. \nYou take your " + weaponChoose1 + " and jump down, swinging your weapon with a devastating downward strike. \n The left orc dies instantly and the right orc leaps back in surprise");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("B.")) {
                        System.out.println("You leap out into the open and encounter two orcs. The orcs are stunned by entrance and you dash forward with your " + weaponChoose1 + " ready.");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("C.")){
                        System.out.println("You crouch into the prickly bushes and stay as still as you can. \n The chilling wind howls around you but you force yourself to stay still. \n You patience was worthwhile as five heavily armored orcs stomp across the road.\n When you are certain that the road is clear, you exit the bushes and carefully follow the orcs' trails");
                    }
                }
            } else if (magicChoose1.equals("D.")) {
                //hands with invisibility
                System.out.println(" cloak yourself with darkness rendering yourself invisible. \n\n As you travel on your chestnut-colored horse, you scan your surroundings. Snow covers ground as far as you can see. \nYou have been traveling for days and you are exhausted. However you remind yourself that it is your duty to protect \nothers who fall under the savagery of the orcs. A cold wave of fear courses through your body as you remember the remains of villagers from the previous town. You had \narrived too late and followed the trail the orcs left behind, vowing to avenge the victims.\n Suddenly, a strong smell hits your nose. Sulfur, ashes. The orcs must be nearby!! You scan the sky for any sign of a camp. Sure enough, a trail of black smoke swivels \n in the air about two miles ahead. You urge you horse to move on, only to run into an enormous mountain blocking your way. \nNearby the mountain, you see a pack of wolves, watching your intently, assessing the threat. You get off of your horse and urge it to go back. You could walk around the mountain but concern for any prisoners the orcs might have cloud your mind.(Choose your action: \n A. walk around the mountain. \n B. scale the mountain.");
                String path1 = keyboard.nextLine();
                if (path1.equals("A.")) {
                    stamina -= 10;
                    System.out.println("Stamina: " + stamina);
                    System.out.println(". You quickly slosh your way through the thick snow. The bitter cold bites your face but you shake the feeling off. \n The wolves, realizing that you pose no threat, head deeper into the forest. Eventually, you make it past the mountain and are almost upon the orc camp. Suddenly, you hear an orc patrol walking by...(Choose one: \n\n A. climb the tree and wait for a perfect opportunity to stike. \n B. leap out and fight the orcs. \n C. hide in the bushes and let the orcs pass. \n D. use your invisibility to take out as many orcs as possible");
                    String tactic1 = keyboard.nextLine();
                    if (tactic1.equals("A.")) {
                        System.out.println("You quickly climb onto the tree and watch the ground below. Only two orcs are passing below you. \nYou take your " + weaponChoose1 + " and jump down, swinging your weapon with a devastating downward strike. \n The left orc dies instantly and the right orc leaps back in surprise");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("B.")) {
                        System.out.println("You leap out into the open and encounter two orcs. The orcs are stunned by entrance and you dash forward with your " + weaponChoose1 + " ready.");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("C.")){
                        System.out.println("You crouch into the prickly bushes and stay as still as you can. \n The chilling wind howls around you but you force yourself to stay still. \n You patience was worthwhile as five heavily armored orcs stomp across the road.\n When you are certain that the road is clear, you exit the bushes and carefully follow the orcs' trails");
                    }
                    else{
                        System.out.println ("Calling upon the power of darkness, your body morphs itself into a dark shadow.\n You propel yourself towards the orcs at speeds orc eyes could never comprehend.\n Seeing only two orcs, you unsheath your " + weaponChoose1 + " and execute the orc on the left.\n An instant later, the other orc met the same fate.\n You search the corpses of the orcs. \n On them were 80 gold, a rusty saw blade, and leather armor. \n\nYou take your loot. Enter '1','2','3',or 'done'");
                        //create arrays for satchel and enemy loots 
                    }
                } else {
                    stamina -= 15;
                    System.out.println("Stamina: " + stamina);
                    health -= 10;
                    System.out.println(". You prepare yourself for the arduous climb. You grab hold of the rocks. As you climb upward, you suddenly slip and injure yourself on the jagged rocks and obtain a minor flesh wound. \n However, you quickly adapt to your situation and make it past the mountain with caution. Suddenly, you hear an orc patrol passing by below ...(Choose one: \n\n A. leap onto a nearby tree and strike from above. \n B. charge straight for the orcs. \n C.wait for the orcs to pass by. \n D. use your invisibility to take out as many orcs as possible ");
                    String tactic1 = keyboard.nextLine();
                    if (tactic1.equals("A.")) {
                        System.out.println("You quickly climb onto the tree and watch the ground below. Only two orcs are passing below you. \nYou take your " + weaponChoose1 + " and jump down, swinging your weapon with a devastating downward strike. \n The left orc dies instantly and the right orc leaps back in surprise");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("B.")) {
                        System.out.println("You leap out into the open and encounter two orcs. The orcs are stunned by entrance and you dash forward with your " + weaponChoose1 + " ready.");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("C.")){
                        System.out.println("You crouch into the prickly bushes and stay as still as you can. \n The chilling wind howls around you but you force yourself to stay still. \n You patience was worthwhile as five heavily armored orcs stomp across the road.\n When you are certain that the road is clear, you exit the bushes and carefully follow the orcs' trails");
                    }
                    else{
                        System.out.println ("Calling upon the power of darkness, your body morphs itself into a dark shadow.\n You propel yourself towards the orcs at speeds orc eyes could never comprehend.\n Seeing only two orcs, you unsheath your " + weaponChoose1 + " and execute the orc on the left.\n An instant later, the other orc met the same fate.\n You search the corpses of the orcs. \n On them were 80 gold, a rusty saw blade, and leather armor. \n\nYou take your loot. Enter '1','2','3',or 'done'");
                        //create arrays for satchel and enemy loots 
                    }
                }
            } else {
                //hands with no magic
                System.out.println(" ... Correction: You don't have any magic abilities. \n\n As you travel on your chestnut-colored horse, you scan your surroundings. Snow covers ground as far as you can see. \nYou have been traveling for days and you are exhausted. However you remind yourself that it is your duty to protect \nothers who fall under the savagery of the orcs. A cold wave of fear courses through your body as you remember the remains of villagers from the previous town. You had \narrived too late and followed the trail the orcs left behind, vowing to avenge the victims.\n Suddenly, a strong smell hits your nose. Sulfur, ashes. The orcs must be nearby!! You scan the sky for any sign of a camp. Sure enough, a trail of black smoke swivels \n in the air about two miles ahead. You urge you horse to move on, only to run into an enormous mountain blocking your way. \nNearby the mountain, you see a pack of wolves, watching your intently, assessing the threat. You get off of your horse and urge it to go back. You could walk around the mountain but concern for any prisoners the orcs might have cloud your mind.(Choose your action: \n A. walk around the mountain. \n B. scale the mountain.");
                String path1 = keyboard.nextLine();
                if (path1.equals("A.")) {
                    stamina -= 10;
                    System.out.println("Stamina: " + stamina);
                    System.out.println(". You quickly slosh your way through the thick snow. The bitter cold bites your face but you shake the feeling off. \n The wolves, realizing that you pose no threat, head deeper into the forest. Eventually, you make it past the mountain and are almost upon the orc camp. Suddenly, you hear an orc patrol walking by...(Choose one: \n\n A. climb the tree and wait for a perfect opportunity to stike. \n B. leap out and fight the orcs. \n C. hide in the bushes and let the orcs pass");
                    String tactic1 = keyboard.nextLine();
                    if (tactic1.equals("A.")) {
                        System.out.println("You quickly climb onto the tree and watch the ground below. Only two orcs are passing below you. \nYou take your " + weaponChoose1 + " and jump down, swinging your weapon with a devastating downward strike. \n The left orc dies instantly and the right orc leaps back in surprise");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("B.")) {
                        System.out.println("You leap out into the open and encounter two orcs. The orcs are stunned by entrance and you dash forward with your " + weaponChoose1 + " ready.");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("C.")){
                        System.out.println("You crouch into the prickly bushes and stay as still as you can. \n The chilling wind howls around you but you force yourself to stay still. \n You patience was worthwhile as five heavily armored orcs stomp across the road.\n When you are certain that the road is clear, you exit the bushes and carefully follow the orcs' trails");
                    }
                } else {
                    stamina -= 15;
                    System.out.println("Stamina: " + stamina);
                    health -= 10;
                    System.out.println(". You prepare yourself for the arduous climb. You grab hold of the rocks. As you climb upward, you suddenly slip and injure yourself on the jagged rocks and obtain a minor flesh wound. \n However, you quickly adapt to your situation and make it past the mountain with caution. Suddenly, you hear an orc patrol passing by below ...(Choose one: \n\n A. leap onto a nearby tree and strike from above. \n B. charge straight for the orcs. \n C.wait for the orcs to pass by ");
                    String tactic1 = keyboard.nextLine();
                    if (tactic1.equals("A.")) {
                        System.out.println("You quickly climb onto the tree and watch the ground below. Only two orcs are passing below you. \nYou take your " + weaponChoose1 + " and jump down, swinging your weapon with a devastating downward strike. \n The left orc dies instantly and the right orc leaps back in surprise");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("B.")) {
                        System.out.println("You leap out into the open and encounter two orcs. The orcs are stunned by entrance and you dash forward with your " + weaponChoose1 + " ready.");
                        //int result = fight(1,"standard");
                    } else if (tactic1.equals("C.")){
                        System.out.println("You crouch into the prickly bushes and stay as still as you can. \n The chilling wind howls around you but you force yourself to stay still. \n You patience was worthwhile as five heavily armored orcs stomp across the road.\n When you are certain that the road is clear, you exit the bushes and carefully follow the orcs' trails");
                    }
                }
            }
        }

    }
}
