import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUItester extends JFrame{
    JButton Logic, AI, Privacy, Person;
    GridLayout gr;
    JFrame logic, ai, privacy, person;
    public GUItester(){
        super("Review Final[18]");
        gr = new GridLayout(2,2);
        setLayout(gr);
        Logic   =  new JButton("Logic");
        AI      =  new JButton("Artificial Intelligence");
        Privacy =  new JButton("Privacy");
        Person  =  new JButton("Personalization of the 'online experience'");



        add(Logic);
        add(AI);
        add(Privacy);
        add(Person);

            pressButton button = new pressButton();
            Logic.addActionListener(button);
            AI.addActionListener(button);
            Privacy.addActionListener(button);
            Person.addActionListener(button);

    }

    private class pressButton implements ActionListener{
        public void actionPerformed(ActionEvent e){

            if(e.getSource() == Logic){
                Object[] options = {"Study (1)", "Quit"};
                int a = JOptionPane.showOptionDialog(logic,//parent container of JOptionPane
                        "(1)  *Be able to define validity and soundness and be able to put\n" +
                                " an argument into valid premise/conclusion form\n",
                        "Logic",
                        JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,//do not use a custom Icon
                        options,//the titles of buttons
                        options[1]);//default button title
                if(a == JOptionPane.YES_OPTION){
                    JOptionPane.showMessageDialog(
                            null,
                            "   Validity - A valid argument is one in which it is impossible" +
                                    "\n   for all of the premises to be true and the conclusion false\n" +
                                    "\n     Another way of saying this:" +
                                    "\n            if the premises are true, then the conclusion is" +
                                    "\n            also true.",
                            "Validity & Soundness",
                            1
                    );
                }
            }
            if(e.getSource() == AI){
                Object[] options2 = {"Study (1)", "Study (2)", "Study (3)", "Quit"};

                int b = JOptionPane.showOptionDialog(ai,//parent container of JOptionPane
                        "(1)  *Be able to explain Searle's attack on Strong AI as well as a" +
                                "\n reply." +
                                "\n         -Strong vs Weak AI" +
                                "\n         -Turing test" +
                                "\n         -What computers do & what they are missing\n\n\n" +
                                "(2)  *Be able to explain the 'AI & Jobs' argument against AI as\n" +
                                "well as a reply." +
                                "\n         *Be able to explain why one might think it's different\n" +
                                "            this time(vs. industrial & agricultural revolutions\n\n\n" +
                                "(3)  *Be able to explain the 'Catastrophic Consequences' argument" +
                                "\nagainst AI as well as a reply." +
                                "\n          -Existential risk" +
                                "\n          -Omohundro's four basic drives\n\n",
                        "Artificial Intelligence",
                        JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,//do not use a custom Icon
                        options2,//the titles of buttons
                        null);//default button title
                if(b == JOptionPane.YES_OPTION){
                    JOptionPane.showMessageDialog(
                            null,
                            " I. Weak AI & Strong AI\n" +
                                    "     (a) Weak AI -- Computers -- As models - are useful tools" +
                                    "\n        for studying minds.\n" +
                                    "     (b) Strong AI - Can have belief and mental states\n" +
                                    "          'The appropriately programmed computer can " +
                                    "\n          literally be said to understand and have other cognitive" +
                                    "\n          state'(Searle thinks AI is false)" +
                                    "\n II. Turing Test" +
                                    "\n III. The Chinese Room\n" +
                                    "\n    Mental states" +
                                    "\n       1. Propositional attitudes - E.G., Belief, thought," +
                                    "\n           understanding, etc." +
                                    "\n       2. Qualitative states ('What it's like') - E.G., " +
                                    "\n            feelings, emotions, pleasure, pain\n" +
                                    "\n  Manipulating uninterpreted (meaningless) symbols according to" +
                                    "\n  their purely formal features (Shapes).\n" +
                                    "\n  What's Missing?" +
                                    "\n    Intentionality - that feature of some of our mental states" +
                                    "\n    by which they are directed at (or, about) things in the" +
                                    "\n    world.",
                            "Searle's attack on Strong Ai & reply",
                            1
                    );
                }
                if(b == JOptionPane.NO_OPTION){


                    JOptionPane.showMessageDialog(
                            null,
                            " -State the AI and jobs argument in premise form and explain\n" +
                                    "  the argument. Provide a criticism, and does the criticism\n" +
                                    "  succeed?\n" +
                                    "  __________________________________________________\n" +
                                    "   Premise (1) The continued development of AI will lead to" +
                                    "\n   the automation of a mast number of jobs.\n" +
                                    "\n   Premise (2) The automation of a vast number of will lead" +
                                    "\n   to a massive unemployment\n" +
                                    "\n   Premise (3) Massive unemployment will lead to to massive" +
                                    "\n   suffering" +
                                    "\n         Premise 1)Those who cannot work should receive a" +
                                    "\n         basic income." +
                                    "\n         Premise 2)In the near future (due to increasing" +
                                    "\n         automation) it will be impossible for everyone" +
                                    "\n         who wants a job to find one." +
                                    "\n         Conclusion) In the near future, who can't work" +
                                    "\n         (due to a lack of jobs) should receive a basic" +
                                    "\n         income.\n" +
                                    "\n   Premise (4) We ought not allow massive suffering\n" +
                                    "\n   Conclusion) We ought not allow the continued development" +
                                    "\n   of AI\n" +
                                    "  ______________________________________________________\n" +
                                    "  Criticism\n" +
                                    "  -Industrial vs. Agricultural\n" +
                                    "       -Why horses don't have jobs anymore\n" +
                                    "       -AI are beginning to outperform cognitively",
                            "AI & Jobs",
                            1
                    );
                }
                if(b == JOptionPane.CANCEL_OPTION){
                    JOptionPane.showMessageDialog(
                            null,
                            "  -State the AI and Catastrophe argument in premise form and\n" +
                                    "   explain the argument. Provide criticism, and does the\n" +
                                    "   criticism succeed?\n" +
                                    "   ________________________________________________\n" +
                                    "   Premise (1) If we create AGI, we may not be able" +
                                    "\n    to control\n" +
                                    "\n   Premise (2) If we create AGI that we may not be able" +
                                    "\n    we create something that may have catastrophic" +
                                    "\n    consequences\n" +
                                    "\n   Premise (3) We ought not create something that may" +
                                    "\n    have catastrophic consequences\n" +
                                    "\n   Conclusion ) We ought not create AGI\n\n" +
                                    "  Omohundro's 4 Drives(Or, Subgoals" +
                                    "\n    - Self-preservation" +
                                    "\n    - Resource acquisition" +
                                    "\n        -> Can be dangerous (chess) because it might try" +
                                    "\n           and make humans chess boards,etc." +
                                    "\n        -> Or insatiable desire for resources" +
                                    "\n    - Efficiency" +
                                    "\n    - Creativity\n" +
                                    "   ______________________________________________\n" +
                                    "   -Criticism\n" +
                                    "       -Value Alignment - Somehow getting machines to\n" +
                                    "       internalize our interests or ethics.",
                            "Catastrophic Consequences",
                            1
                    );
                }
            }
            if(e.getSource() == Privacy){
                Object[] options3 = {"Study (1)", "Study (2)", "Study (3)", "Quit"};
                int c = JOptionPane.showOptionDialog(privacy,//parent container of JOptionPane
                        "(1)  *Be able to explain at least four reasons why privacy is" +
                                "\nvaluable\n\n\n" +
                                "(2)   *Be able to discuss a contemporary infringement on the right" +
                                "\nto privacy as well as reasons one might find it to be" +
                                "\nimpermissible and/or permissible\n\n\n" +
                                "(3)   *Be able to distinguish the right to privacy, the right to" +
                                "\nobscurity, and the right to be forgotten. Be able to give" +
                                "\nreasons why one might be preferable to the others in the virtue" +
                                "\nof the value of privacy\n\n",
                        "Privacy",
                        JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,//do not use a custom Icon
                        options3,//the titles of buttons
                        options3[3]);//default button title
                if(c == JOptionPane.YES_OPTION){
                    JOptionPane.showMessageDialog(
                            null,
                            "Briefly explain the argument in regard to the right to privacy\n" +
                                    "   -Which do you think is the correct view?\n" +
                                    "   -Try to motivate your view on the argument and explain\n" +
                                    "   by using 2-3 reasons as to why privacy is valuable\n\n" +
                                    "   1)Confidentiality\n" +
                                    "   2)Physical Security\n" +
                                    "   3)From other having control or power over us\n",
                            "Why is privacy valuable?",
                            1
                    );
                }
                if(c == JOptionPane.NO_OPTION){
                    JOptionPane.showMessageDialog(
                            null,
                            "Extra Credit",
                            "Contemporary Infringement(impermissible and/or permissible)",
                            1
                    );
                }
                if(c == JOptionPane.CANCEL_OPTION){
                    JOptionPane.showMessageDialog(
                            null,
                            "                 The Right to Privacy\n" +
                                    "\n     Premise (1) The right to be left alone" +
                                    "\n              - the right to keep one's information" +
                                    "\n                off of the public domain.\n" +
                                    "\n     Premise (2) The right to be forgotten" +
                                    "\n              - the right to remove one's information" +
                                    "\n                from the public domain.\n" +
                                    "\n     Premise (3) The right to obscurity (the state of" +
                                    "\n      being unknown, inconspicuous, or, unimportant)" +
                                    "\n              - the right to have one's information be" +
                                    "\n                difficult to find\n",
                            "Right to privacy, obscurity, & to be forgotten",
                            1
                    );
                }
                            }
            if(e.getSource() == Person){
                Object[] options = {"Study (1)", "Quit"};
                int d = JOptionPane.showOptionDialog(person,//parent container of JOptionPane
                        "(1)  *Be able to explain and distinguish between two 'echo chambers' & " +
                                "\n    'filter bubbles' as well as some of their potentially problematic" +
                                "\n     implications." +
                                "\n              -Be able to provide possible solutions\n",
                        "Personalization of the 'online experience'",
                        JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,//do not use a custom Icon
                        options,//the titles of buttons
                        options[1]);//default button title
                if(d == JOptionPane.YES_OPTION){
                    JOptionPane.showMessageDialog(
                            null,
                            "Personalization and curating of our online experiences threatens to lead us into:" +
                                    "\n                         Filter Bubbles         &           Echo Chambers\n" +
                                    "\nFilter Bubbles (Epistemic Bubbles)" +
                                    "\n     - State of intellectual isolation resulting from the personalizing (or curating) of" +
                                    "\n       searches and the online experience OR from one's selecting information that is" +
                                    "\n       consistent with one's previous belief's" +
                                    "\n              - other voices not heard" +
                                    "\n                     - Information Overload" +
                                    "\n     - Not a sufficiently broad representation of the relevant information" +
                                    "\n     - Easier to escape" +
                                    "\n              - All you need to know is the information exposed to you.\n\n" +
                                    "Echo Chambers" +
                                    "\n     - (getting back what you put out; your own views)" +
                                    "\n     - Context in which some ideas are reinforced/amplified while others are" +
                                    "\n       underrepresented, disregarded, discredited, or mocked." +
                                    "\n               - Other voices are actively discredited" +
                                    "\n     - Similar to cults\n" +
                                    "\nBoth Filter Bubbles and Echo Chambers threaten to:" +
                                    "\n     1) Reinforce confirmation bias" +
                                    "\n     2) Lead to 'corrosive corroboration' & 'Excessive self - confidence'" +
                                    "\n     3) Lead to & amplify polarization" +
                                    "\n     4) Undercut objectivity",
                            "Echo Chambers Vs. Filter Bubbles",
                            1
                    );
                }
            }
        }
    }
}
