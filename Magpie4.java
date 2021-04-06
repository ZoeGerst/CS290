
/**
 * A program to carry on conversations with a human user.
 * This version:
 *<ul><li>
 *      Uses advanced search for keywords 
 *</li><li>
 *      Will transform statements as well as react to keywords
 *</li></ul>
 * @author Laurie White
 * @version April 2012
 *
 */
public class Magpie4
{
    /**
     * Get a default greeting   
     * @return a greeting
     */ 
    public String getGreeting()
    {
        return "Oh!Oh!Gravity Falls, it's good to be back!";
    }
    
    /**
     * Gives a response to a user statement
     * 
     * @param statement
     *            the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement)
    {
        String response = "";
        
        String[] noResponses = {"No to you back, okay?", "Why so negative?", 
                                "Yes?", "Too bad.", "I don't care.", 
                                "DO YOU HAVE ANY IDEA WHAT I'M LIKE WHEN I'M MAD?!??"};
        String[] nameResponses = {"Name's Bill, but you can call me your new lord and master for all of eternity!", 
                                  "Name's Bill, and I take it you're some kind of living ventriloguist dummy?", 
                                  "Name's Bill Cipher, here's some deer teeth, on the house, kid!"};
        
        String[] byeResponses = {"REMEMBER, REALITY IS AN ILLUSION, THE UNIVERSE IS A HOLLOGRAM, BUY GOLD, BYEEEEEEEE", 
                                 "Race ya to the bottom of the stairs!", 
                                 "Until next time, I'll be watching you! I'll be watcing you!", 
                                 "We'll meet again, don't know where, don't when. Oh I know we'll meet again some sunny day!", 
                                 "Now if you'll excuse me, I have some children I gotta make into corpses!",
                                 "!NRUTER YAM I TAHT REWOP TNEICNA EHT EKOVNI I ,NRUB OT EMOC SAH EMIT YM ,.L.T.O.L.O.X.A"};
                                 
        String[] rockPaperScissors = {"Rock", "Paper", "Scissors", "Laser", "Fire", "Death"} ;
        
        String[] hiResponses = {"Hiya, smart guy!", "Yellow!", "Bonjour", "olleH", "Keoor",
                                "Well, well, well, well, well, well, well-well-well-well-well! Aren't you a sight for sore eye!"};
         if (statement.length() == 0)
        {
            System.exit(0);
        }

        else if (findKeyword(statement, "no") >= 0)
        {
            response =  noResponses[(int)(Math.random() * noResponses.length)];
        }
        else if (findKeyword(statement, "Hi") >= 0
                || findKeyword(statement, "hi") >= 0
                || findKeyword(statement, "Hi!") >= 0
                || findKeyword(statement, "hi!") >= 0
                || findKeyword(statement, "Hello") >= 0
                || findKeyword(statement, "hello") >= 0
                || findKeyword(statement, "hello!") >= 0
                || findKeyword(statement, "Hello!") >= 0)
        {
            response =  hiResponses[(int)(Math.random() * hiResponses.length)];
        }
        else if (findKeyword(statement, "mother") >= 0
                || findKeyword(statement, "father") >= 0
                || findKeyword(statement, "sister") >= 0
                || findKeyword(statement, "brother") >= 0)
        {
            response = "Forget your family and join my gang of freaks.";
        }
        
        else if (findKeyword(statement, "You're insane", 0) >= 0)
        {
         response = "Sure I am, what's your point?";   
        }
        
        else if (findKeyword(statement, "Who are you?") >= 0
                || findKeyword(statement,"What's your name?") >= 0)
        {
         response = nameResponses[(int)(Math.random() * nameResponses.length)];    
        }
        
        else if (findKeyword(statement, "Can I ask you a question?") >= 0
                || findKeyword(statement,"I have a question?") >= 0
                || findKeyword(statement, "Can I ask you something?") >= 0)
        {
            response = "Well, well, well. Someone's looking desperate.";
        }
        
        else if (findKeyword(statement, "That hurt") >= 0
                 || findKeyword(statement,"Ow") >= 0
                 || findKeyword(statement,"Ouch") >= 0)
        {
          response = "Pain is hilarious!";  
        }
        
        else if (findKeyword(statement, "I want to make a deal") >= 0)
        {
            response = "Good choice. I'll give you what you want, but in return I want a puppet.";   
        }
        
        else if (findKeyword(statement, "A puppet?") >= 0)
        {
         response = "Everyone loves puppets!";   
        }
        
        else if (findKeyword(statement, "What puppet do you want?") >= 0
                || findKeyword(statement, "What puppet are you gonna pick?") >= 0
                || findKeyword(statement, "What puppet are you going to pick?") >= 0)
        {
            response = "Let's see, eeny meany miney... \n   S[Y]stem Err[O]r \n   Press ENTER to contin[U]e[!]";   
        }
        
        else if (findKeyword(statement, "Come and get me you pointy jerk") >= 0
                    || findKeyword(statement, "come and get me you pointy jerk") >= 0
                    || findKeyword(statement, "come and get me you jerk") >= 0
                    || findKeyword(statement, "Come and get me you jerk") >= 0
                    || findKeyword(statement, "Come and get me") >= 0
                    || findKeyword(statement, "come and get me") >= 0)
        {
         response = "WHEN I GET MY HANDS ON YOU, I'M GONNA DISASSEMBLE YOUR MOLECULES!";   
        }
        
        else if (findKeyword(statement, "Can I have Doritos?") >= 0
                    || findKeyword(statement, "Can I have doritos?") >= 0
                    || findKeyword(statement, "Can I have doritos") >= 0
                    || findKeyword(statement, "Can I have Doritos") >= 0
                    || findKeyword(statement, "can I have doritos?") >= 0
                    || findKeyword(statement, "can I have doritos") >= 0
                    || findKeyword(statement, "can I have Doritos?") >= 0
                    || findKeyword(statement, "Doritos?") >= 0
                    || findKeyword(statement, "doritos?") >= 0
                    || findKeyword(statement, "Doritos") >= 0
                    || findKeyword(statement, "doritos") >= 0)
        {
         response = "THOSE ARE MY CHILDREN!";   
        }
        
        else if (findKeyword(statement, "I'm eating your children!") >= 0
                || findKeyword(statement, "I'm eating your children") >= 0
                || findKeyword(statement, "Im eating your children") >= 0
                || findKeyword(statement, "im eating your children") >= 0
                || findKeyword(statement, "i'm eating your children") >= 0
                || findKeyword(statement, "I ate your children") >= 0
                || findKeyword(statement, "i ate your children") >= 0)
        {
            response = "WHEN I GET MY HANDS ON YOU, I'M GONNA DISASSEMBLE YOUR MOLECULES!";
        }
        
        else if (findKeyword(statement, "I like my molecules where they are") >= 0
                || findKeyword(statement, "i like my molecules where they are") >= 0)
        {
            response = "TOO BAD";
        }
        
        else if (findKeyword(statement, "I think I broke something") >= 0
                || findKeyword(statement, "i think i broke something") >= 0)
        {
            response = "WALK IT OFF";
        }
        
        else if (findKeyword(statement, "I know your weakness") >= 0)
        {
         response = "And I know a riddle! Why did the guy wasting their life behind a computer Press ENTER?";   
        }
        
        else if (findKeyword(statement, "Press ENTER?") >= 0
                                    || findKeyword(statement, "Press Enter?") >= 0
                                    || findKeyword(statement, "Press enter?") >= 0
                                    || findKeyword(statement, "press enter?") >= 0
                                    || findKeyword(statement, "press enter") >= 0)
        {
         response = "Because I needed a new backscratcher \n   System Error \n   Press ENTER to continue";   
        }
        
        else if (findKeyword(statement, "Here's some soda") >= 0
                 || findKeyword(statement, "Heres some soda") >= 0
                 || findKeyword(statement, "here's some soda") >= 0
                 || findKeyword(statement, "heres some soda") >= 0
                 || findKeyword(statement, "Have some soda") >= 0
                 || findKeyword(statement, "have some soda") >= 0)
        {
            response = "Human soda! I'm gonna drink it like a person! \n*Pours in eyes*";
        }
        
        else if (findKeyword(statement,"Rock") == 0
                || findKeyword(statement,"Paper") == 0
                || findKeyword(statement,"Scissors") == 0
                || findKeyword(statement,"paper") == 0
                || findKeyword(statement,"rock") == 0
                || findKeyword(statement,"scissors") == 0)
        {
         response = rockPaperScissors[(int)(Math.random() * rockPaperScissors.length)];
            if ((statement.equals("Rock") || statement.equals("rock")) && (response.equals("Rock")))
            {
             System.out.println("It's a tie");
            }
            else if ((statement.equals("Paper") || statement.equals("paper")) && (response.equals("Paper")))
            {
             System.out.println("It's a tie");
            }
            else if ((statement.equals("Scissors") || statement.equals("scissors")) && (response.equals("Scissors")))
            {
             System.out.println("It's a tie");
            }
            else if ((statement.equals("Rock") || statement.equals("rock")) && (response.equals("Paper")))
            {
             System.out.println("I WIN! YOUR SOUL IS MINE!");
            }
            else if ((statement.equals("Rock") || statement.equals("rock")) && (response.equals("Scissors")))
            {
             System.out.println("You win this round, meatbag >(-)");
            }
            else if ((statement.equals("Rock") || statement.equals("rock")) && (response.equals("Fire")))
            {
             System.out.println("NRUB OT EMOC SAH EMIT RUOY");
            }
            else if ((statement.equals("Rock") || statement.equals("rock")) && (response.equals("Laser")))
            {
             System.out.println("HOW 'BOUT THIS? BOOM!");
            }
            else if ((statement.equals("Rock") || statement.equals("rock")) && (response.equals("Death")))
            {
             System.out.println("I don't know why I don't solve all my problems like this");
            }
            else if ((statement.equals("Paper") || statement.equals("paper")) && (response.equals("Rock")))
            {
             System.out.println("You win this round, meatbag >(-)");
            }
            else if ((statement.equals("Paper") || statement.equals("paper")) && (response.equals("Scissors")))
            {
             System.out.println("I WIN! YOUR SOUL IS MINE!");
            }
            else if ((statement.equals("Paper") || statement.equals("paper")) && (response.equals("Fire")))
            {
             System.out.println("NRUB OT EMOC SAH EMIT RUOY");
            }
            else if ((statement.equals("Paper") || statement.equals("paper")) && (response.equals("Laser")))
            {
             System.out.println("HOW 'BOUT THIS? BOOM!");
            }
            else if ((statement.equals("Paper") || statement.equals("paper")) && (response.equals("Death")))
            {
             System.out.println("I don't know why I don't solve all my problems like this");
            }
            else if ((statement.equals("Scissors") || statement.equals("scissors")) && (response.equals("Rock")))
            {
             System.out.println("I WIN! YOUR SOUL IS MINE!");
            }
            else if ((statement.equals("Scissors") || statement.equals("scissors")) && (response.equals("Paper")))
            {
             System.out.println("You win this round, meatbag >(-)");
            }
            else if ((statement.equals("Scissors") || statement.equals("scissors")) && (response.equals("Fire")))
            {
             System.out.println("NRUB OT EMOC SAH EMIT RUOY");
            }
            else if ((statement.equals("Scissors") || statement.equals("scissors")) && (response.equals("Laser")))
            {
             System.out.println("HOW 'BOUT THIS? BOOM!");
            }
            else if ((statement.equals("Scissors") || statement.equals("scissors")) && (response.equals("Death")))
            {
             System.out.println("I don't know why I don't solve all my problems like this");
            }

        }
        
        else if (findKeyword(statement,"Lets play rock, paper, scissors") >= 0
                || findKeyword(statement,"Wanna play rock, paper, scissors?") >= 0
                || findKeyword(statement,"wanna play rock paper scissors?") >= 0
                || findKeyword(statement,"Want to play rock, paper, scissors?") >= 0
                || findKeyword(statement,"want to play rock, paper, scissors?") >= 0
                || findKeyword(statement,"Wanna play rock, paper, scissors") >= 0
                || findKeyword(statement,"Wanna play rock paper scissors?") >= 0
                || findKeyword(statement,"Wanna play rock paper scissors") >= 0
                || findKeyword(statement,"want to play rock, paper, scissors") >= 0
                || findKeyword(statement,"want to play rock paper scissors?") >= 0
                || findKeyword(statement,"want to play rock paper scissors") >= 0
                || findKeyword(statement,"lets play rock paper scissors") >= 0
                || findKeyword(statement,"Let's play rock, paper, scissors") >= 0
                || findKeyword(statement,"Let's play rock paper scissors") >= 0
                || findKeyword(statement,"let's play rock, paper, scissors") >= 0
                || findKeyword(statement,"let's play rock paper scissors") >= 0)
                {
                    response = "Sure! \n 1 \n 2 \n 3 \nSHOOT!";
                }
                
        else if (findKeyword(statement,"fuck") >= 0
                || findKeyword(statement,"damn") >= 0
                || findKeyword(statement,"shit") >= 0
                || findKeyword(statement,"bitch") >= 0
                || findKeyword(statement,"ass") >= 0
                || findKeyword(statement,"bollocks") >= 0
                || findKeyword(statement,"crap") >= 0
                || findKeyword(statement,"arse") >= 0)
        {
          response = "WHAT THE HECK, MEATBAG! LANGUAGE!";  
        }
        
        else if (findKeyword(statement,"Wait, you're a demon. Can't you say 'hell'?") >= 0
               || findKeyword(statement,"wait, you're a demon. can't you say 'hell'?") >= 0
               || findKeyword(statement,"wait you're a demon can't you say 'hell'?") >= 0
               || findKeyword(statement,"wait you're a demon can't you say hell?") >= 0
               || findKeyword(statement,"wait your a demon cant you say hell") >= 0
               || findKeyword(statement,"You're a demon. Can't you say 'hell'?") >= 0
               || findKeyword(statement,"you're a demon. can't you say 'hell'?") >= 0
               || findKeyword(statement,"youre a demon. cant you say hell?") >= 0
               || findKeyword(statement,"youre a demon cant you say hell") >= 0
               || findKeyword(statement,"Can't you say 'hell'?") >= 0
               || findKeyword(statement,"can't you say 'hell'?") >= 0
               || findKeyword(statement,"can't you say hell?") >= 0
               || findKeyword(statement,"can't you say hell") >= 0
               || findKeyword(statement,"cant you say hell?") >= 0
               || findKeyword(statement,"cant you say hell") >= 0)
        {
            response = "THAT'S A BAD F**KING WORD, MEATBAG! I'M GONNA WASH YOUR MOUTH OUT WITH SOAP";
        }

        
        else if (findKeyword(statement, "My name is ", 0) >= 0)
        {
           response = "I already knew that, I.Q."; 
        }
        
        else if (findKeyword(statement,"bye") >= 0)
        {
         response = byeResponses[(int)(Math.random() * byeResponses.length)];
        }

        // Responses which require transformations
        else if (findKeyword(statement, "I want to", 0) >= 0)
        {
            response = transformIWantToStatement(statement);
        }
        
        else if (findKeyword(statement, "I want", 0) >= 0)
        {
            response = transformIWantSomething(statement);
        }

        else
        {
            // Look for a two word (you <something> me)
            // pattern
            int psn = findKeyword(statement, "you", 0);

            if (psn >= 0
                    && findKeyword(statement, "me", psn) >= 0)
            {
                response = transformYouMeStatement(statement);
            }
            
            
            
            else
            {
                response = getRandomResponse();
            }
        }
        return response;
    }
    
    /**
     * Take a statement with "I want to <something>." and transform it into 
     * "What would it mean to <something>?"
     * @param statement the user statement, assumed to contain "I want to"
     * @return the transformed statement
     */
    private String transformIWantToStatement(String statement)
    {
        //  Remove the final period, if there is one
        statement = statement.trim();
        String lastChar = statement.substring(statement
                .length() - 1);
        if (lastChar.equals("."))
        {
            statement = statement.substring(0, statement
                    .length() - 1);
        }
        int psn = findKeyword (statement, "I want to", 0);
        String restOfStatement = statement.substring(psn + 9).trim();
        return "What would it mean to " + restOfStatement + "?";
    }
    
    private String transformIWantSomething(String statement)
    {
        //  Remove the final period, if there is one
        statement = statement.trim();
        String lastChar = statement.substring(statement
                .length() - 1);
        if (lastChar.equals("."))
        {
            statement = statement.substring(0, statement
                    .length() - 1);
        }
        String keyword = "I want";
        int psn = findKeyword (statement, keyword, 0);
        String restOfStatement = statement.substring(psn + keyword.length()).trim();
        return "Why do you want " + restOfStatement + "?";
    }

    
    
    /**
     * Take a statement with "you <something> me" and transform it into 
     * "What makes you think that I <something> you?"
     * @param statement the user statement, assumed to contain "you" followed by "me"
     * @return the transformed statement
     */
    private String transformYouMeStatement(String statement)
    {
        //  Remove the final period, if there is one
        statement = statement.trim();
        String lastChar = statement.substring(statement
                .length() - 1);
        if (lastChar.equals("."))
        {
            statement = statement.substring(0, statement
                    .length() - 1);
        }
        
        int psnOfYou = findKeyword (statement, "you", 0);
        int psnOfMe = findKeyword (statement, "me", psnOfYou + 3);
        
        String restOfStatement = statement.substring(psnOfYou + 3, psnOfMe).trim();
        return "What makes you think that I " + restOfStatement + " you, meatbag?";
    }
    
    

    
    
    /**
     * Search for one word in phrase. The search is not case
     * sensitive. This method will check that the given goal
     * is not a substring of a longer string (so, for
     * example, "I know" does not contain "no").
     *
     * @param statement
     *            the string to search
     * @param goal
     *            the string to search for
     * @param startPos
     *            the character of the string to begin the
     *            search at
     * @return the index of the first occurrence of goal in
     *         statement or -1 if it's not found
     */
    private int findKeyword(String statement, String goal,
            int startPos)
    {
        String phrase = statement.trim().toLowerCase();
        goal = goal.toLowerCase();

        // The only change to incorporate the startPos is in
        // the line below
        int psn = phrase.indexOf(goal, startPos);

        // Refinement--make sure the goal isn't part of a
        // word
        while (psn >= 0)
        {
            // Find the string of length 1 before and after
            // the word
            String before = " ", after = " ";
            if (psn > 0)
            {
                before = phrase.substring(psn - 1, psn);
            }
            if (psn + goal.length() < phrase.length())
            {
                after = phrase.substring(
                        psn + goal.length(),
                        psn + goal.length() + 1);
            }

            // If before and after aren't letters, we've
            // found the word
            if (((before.compareTo("a") < 0) || (before
                    .compareTo("z") > 0)) // before is not a
                                            // letter
                    && ((after.compareTo("a") < 0) || (after
                            .compareTo("z") > 0)))
            {
                return psn;
            }

            // The last position didn't work, so let's find
            // the next, if there is one.
            psn = phrase.indexOf(goal, psn + 1);

        }

        return -1;
    }
    
    /**
     * Search for one word in phrase.  The search is not case sensitive.
     * This method will check that the given goal is not a substring of a longer string
     * (so, for example, "I know" does not contain "no").  The search begins at the beginning of the string.  
     * @param statement the string to search
     * @param goal the string to search for
     * @return the index of the first occurrence of goal in statement or -1 if it's not found
     */
    private int findKeyword(String statement, String goal)
    {
        return findKeyword (statement, goal, 0);
    }
    


    /**
     * Pick a default response to use if nothing else fits.
     * @return a non-committal string
     */
      private String getRandomResponse()
    {
        String[] responses = {"Hey, want to here my impression of you in about 3 seconds? AHHHHH!", 
                              "Do you really think so?",
                              "You don't say.",
                              "I disagree.",
                              "Look, it's Time Baby!",
                              "Meh.", 
                              "Oh hey! Look at that... I don't care", 
                              "It's funny how dumb you are!",
                              "How 'bout I reverse the functions of every hole on your face",
                              "Don't play dumb, I.Q!",
                              "One nightmare coming up"};
        int index = (int)(Math.random() * responses.length); //response.length is a variable, gets random index 0-6
        return responses[index];
        
        
    }

}
