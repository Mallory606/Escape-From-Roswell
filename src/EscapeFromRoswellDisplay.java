import javafx.geometry.Pos;
import javafx.geometry.Side;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/******************************************************************************
 * Ashley Krattiger                                                           *
 *                                                                            *
 * Escape From Roswell - Choose-Your-Own-Adventure Game                       *
 *                                                                            *
 * This game is contained in a single class which plays using buttons to jump *
 * to different Scenes containing the story.                                  *
 *****************************************************************************/
public class EscapeFromRoswellDisplay extends javafx.application.Application{
    Scene titleScene;
    Scene scenarioScene;
    Scene firstScene;
    Scene meetResScene;
    Scene hideShipScene;
    Scene runScene;
    Scene hideBarnScene;
    Scene dummyScene;
    Scene talkGenScene;
    Scene stayHidScene;
    Scene stealDebScene;
    Scene askParScene;
    Scene askManScene;
    Scene nextScene;
    Scene stealRestScene;
    Scene stealPartScene;
    Scene folGenScene;
    Scene moveShipScene;
    Scene stayPutScene;
    Scene jumpOutScene;
    Scene stayHid2Scene;

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Escape From Roswell");

        Label titleLabel1 = new Label("Escape From Roswell");
        titleLabel1.setFont(new Font(50));
        Label titleLabel2 = new Label("Choose-Your-Own-Adventure Game");
        titleLabel2.setFont(new Font(30));
        Label titleLabel3 = new Label("by Ashley Krattiger");
        titleLabel3.setFont(new Font(30));
        Button startButton1 = new Button("Start");
        startButton1.setFont(new Font(20));
        startButton1.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
            primaryStage.setScene(scenarioScene);
        });
        VBox titleBox = new VBox(10);
        titleBox.setAlignment(Pos.CENTER);
        titleBox.setBackground(new Background(new BackgroundImage(new Image
                ("RoswellBackground.jpg"), BackgroundRepeat.REPEAT,
                BackgroundRepeat.REPEAT, new BackgroundPosition(Side.LEFT, 0,
                false, Side.TOP, 0, false), new BackgroundSize(BackgroundSize.AUTO,
                BackgroundSize.AUTO, true, true, false, true))));
        titleBox.getChildren().addAll(titleLabel1, titleLabel2, titleLabel3,
                startButton1);
        titleScene = new Scene(titleBox, 500, 375);

        Label scenarioTitle = new Label("Scenario");
        scenarioTitle.setFont(new Font(30));
        Label scenarioDate = new Label("July 4, 1947");
        scenarioDate.setFont(new Font(20));
        Label scenarioBody = new Label("           You are an alien on a trip with "+
                "your and several other families to the Milky Way\n system. Due to "+
                "most of the planets being uninhabited, everyone has brought "+
                "their\n personal short-range ships with them to explore the "+
                "region on their own. One night you\n get on a call with a friend"+
                " back home and they dare you to get close to the only inhabited"+
                "\n planet and bring back proof. You accept the challenge and sneak"+
                "out to your parent’s\n ship. The trip to Earth goes smoothly until"+
                " you try to grab one of the large metal\n octagons the locals have"+
                " placed all over their settlement. You try to use the ship’s\n "+
                "collection arm to pry it from its staff, but you see lights behind"+
                " you as one of their\n ground vehicles races towards you. In your"+
                " haste to get out of sight, the ship knocks\n against one of their "+
                "buildings and you hear the ship’s interface start to blare warnings."+
                "\n You manage to escape the settlement but lose control of the ship "+
                "over a lone building\n and crash.");
        scenarioBody.setFont(new Font(20));
        Button startButton2 = new Button("Start");
        startButton2.setFont(new Font(20));
        startButton2.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
            primaryStage.setScene(firstScene);
        });
        VBox scenarioBox = new VBox(5);
        scenarioBox.setAlignment(Pos.CENTER);
        scenarioBox.setBackground(new Background(new BackgroundImage(new Image
                ("UFOBackground.jpg"), BackgroundRepeat.REPEAT,
                BackgroundRepeat.REPEAT, new BackgroundPosition(Side.LEFT, 0,
                false, Side.TOP, 0, false), new BackgroundSize(BackgroundSize.AUTO,
                BackgroundSize.AUTO, true, true, false, true))));
        scenarioBox.getChildren().addAll(scenarioTitle, scenarioDate,
                scenarioBody, startButton2);
        scenarioScene = new Scene(scenarioBox, 800, 600);

        Label firstLabel = new Label("        You wake up and see that "+
                "luckily you haven’t\n been out for long. The ship is unusable but"+
                " is mostly\n intact except for some debris from the bottom of the\n "+
                "ship that fell off right after you passed over that lone\n building."+
                " You are now on a hill overlooking the\n scene and see that the"+
                " lights are now on inside the\n building. The resident will likely"+
                " be coming to\n investigate soon. What do you do?");
        firstLabel.setFont(new Font(20));
        Button meetResButton = new Button(" Go to Meet\nthe Resident");
        meetResButton.setFont(new Font(20));
        meetResButton.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
            primaryStage.setScene(meetResScene);
        });
        Button hideShipButton = new Button("Hide the Ship");
        hideShipButton.setFont(new Font(20));
        hideShipButton.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
            primaryStage.setScene(hideShipScene);
        });
        Button runButton = new Button("Run");
        runButton.setFont(new Font(20));
        runButton.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
            primaryStage.setScene(runScene);
        });
        HBox firstButtonBox = new HBox(20);
        firstButtonBox.setAlignment(Pos.CENTER);
        firstButtonBox.getChildren().addAll(meetResButton, hideShipButton,
                runButton);
        VBox firstBox = new VBox(20);
        firstBox.setAlignment(Pos.CENTER);
        firstBox.setBackground(new Background(new BackgroundImage(new Image
                ("DesertBackground.jpg"), BackgroundRepeat.REPEAT,
                BackgroundRepeat.REPEAT, new BackgroundPosition(Side.LEFT, 0,
                false, Side.TOP, 0, false), new BackgroundSize(BackgroundSize.AUTO,
                BackgroundSize.AUTO, true, true, false, true))));
        firstBox.getChildren().addAll(firstLabel, firstButtonBox);
        firstScene = new Scene(firstBox, 500, 375);



        Label meetResLabel = new Label("        You walk out to meet the resident"+
                " where the patch of debris fell. He comes out\n cautiously to "+
                "investigate and begins shouting when he sees you. You are surprised"+
                " when\n you understand him, but then you remember the universal "+
                "language implant your\n parents made you get before the trip. You"+
                " manage to calm him down and explain your\n situation. He understands,"+
                " and promises not to say anything to the other humans while\n you are"+
                " trying to figure out what to do about your ship. He offers to let"+
                " you stay in his\n barn and you accept. In the morning, you get to work"+
                " trying to fix the communicator on\n your ship. The man watches you"+
                " work and at some point brings his children to meet you.\n Due to the"+
                " damages and your lack of experience with repairing ships this process"+
                " is likely\n to take you over a week. A few days after your crash you"+
                " hear the man upset at his son.\n Apparently the son said something to"+
                " the local media about finding materials of\n extraterrestrial origin"+
                " and they were spreading the story everywhere. On July 9th, the man\n "+
                "tells you that an Air Force General is coming to investigate. What"+
                " do you do?");
        meetResLabel.setFont(new Font(20));
        Button hideBarnButton = new Button("Hide in the Barn");
        hideBarnButton.setFont(new Font(20));
        hideBarnButton.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
            primaryStage.setScene(hideBarnScene);
        });
        Button dummyButton = new Button("  Pretend to be a\nCrash Test Dummy");
        dummyButton.setFont(new Font(20));
        dummyButton.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
            primaryStage.setScene(dummyScene);
        });
        Button talkGenButton = new Button("Talk to the General");
        talkGenButton.setFont(new Font(20));
        talkGenButton.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
            primaryStage.setScene(talkGenScene);
        });
        HBox meetResButtonBox = new HBox(20);
        meetResButtonBox.setAlignment(Pos.CENTER);
        meetResButtonBox.getChildren().addAll(hideBarnButton, dummyButton,
                talkGenButton);
        VBox meetResBox = new VBox(20);
        meetResBox.setAlignment(Pos.CENTER);
        meetResBox.setBackground(new Background(new BackgroundImage(new Image
                ("DesertBackground.jpg"), BackgroundRepeat.REPEAT,
                BackgroundRepeat.REPEAT, new BackgroundPosition(Side.LEFT, 0,
                false, Side.TOP, 0, false), new BackgroundSize(BackgroundSize.AUTO,
                BackgroundSize.AUTO, true, true, false, true))));
        meetResBox.getChildren().addAll(meetResLabel, meetResButtonBox);
        meetResScene = new Scene(meetResBox, 800, 600);

        Label hideShipLabel = new Label("       You manage to cloak the ship "+
                "but the pieces that broke off stay\n visible. You remain in the ship"+
                " so you won’t be seen as the resident\n cautiously investigates the "+
                "debris. You see him play around with the\n chunks of metal and "+
                "eventually he returns to the building. When he\n comes back out, there"+
                " are more of them all looking around at the\n chunks of wreckage. "+
                "Some of them pick up smaller pieces and take\n them when they leave. "+
                "Deciding to lay low, you spend the night\n in the cloaked ship. You "+
                "wake up the next morning and see two of\n the residents outside "+
                "talking. Remembering the universal language\n implant your parents "+
                "made you get for your trip, you decide to\n listen in on their "+
                "conversation. You hear the taller one mention\n calling a “Major”"+
                " about the debris from your ship, and that this\n “Major” would "+
                "be coming today to see it. What do you do?");
        hideShipLabel.setFont(new Font(20));
        Button stayHidButton = new Button("Stay Hidden");
        stayHidButton.setFont(new Font(20));
        stayHidButton.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
            primaryStage.setScene(stayHidScene);
        });
        Button stealDebButton = new Button("Steal the Rest of the Debris");
        stealDebButton.setFont(new Font(20));
        stealDebButton.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
            primaryStage.setScene(stealDebScene);
        });
        HBox hideShipButtonBox = new HBox(20);
        hideShipButtonBox.setAlignment(Pos.CENTER);
        hideShipButtonBox.getChildren().addAll(stayHidButton, stealDebButton);
        VBox hideShipBox = new VBox(20);
        hideShipBox.setAlignment(Pos.CENTER);
        hideShipBox.setBackground(new Background(new BackgroundImage(new Image
                ("DesertBackground.jpg"), BackgroundRepeat.REPEAT,
                BackgroundRepeat.REPEAT, new BackgroundPosition(Side.LEFT, 0,
                false, Side.TOP, 0, false), new BackgroundSize(BackgroundSize.AUTO,
                BackgroundSize.AUTO, true, true, false, true))));
        hideShipBox.getChildren().addAll(hideShipLabel, hideShipButtonBox);
        hideShipScene = new Scene(hideShipBox, 620, 515);

        Label runLabel = new Label("       You flee the scene successfully and"+
                " find a cave\n nearby to hide in. Not knowing where to go from"+
                "\n there, you decide to spend the night there. You are\n awoken "+
                "in the morning by the sounds of people\n shouting outside. Your"+
                " ship, intact and out in the open,\n was quickly found and with"+
                " overwhelming evidence,\n the Air Force stepped in to mount a "+
                "search for you.\n Cornered and afraid, you are dragged from your"+
                " cave\n and captured by the US Government.\n\n                "+
                "                   GAME OVER");
        runLabel.setFont(new Font(20));
        Button retryButton = new Button("Play Again");
        retryButton.setFont(new Font(20));
        retryButton.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
            primaryStage.setScene(titleScene);
        });
        VBox runBox = new VBox(20);
        runBox.setAlignment(Pos.CENTER);
        runBox.setBackground(new Background(new BackgroundImage(new Image
                ("DesertBackground.jpg"), BackgroundRepeat.REPEAT,
                BackgroundRepeat.REPEAT, new BackgroundPosition(Side.LEFT, 0,
                false, Side.TOP, 0, false), new BackgroundSize(BackgroundSize.AUTO,
                BackgroundSize.AUTO, true, true, false, true))));
        runBox.getChildren().addAll(runLabel, retryButton);
        runScene = new Scene(runBox, 580, 435);



        Label hideBarnLabel = new Label("       You work with the man and his"+
                " family to create a fake piece of the\n ship using random "+
                "materials from around their house. Surprisingly, the\n rubber "+
                "strips, tinfoil, paper, and sticks made a convincing structure.\n"+
                " With the decoy set you rush off to the barn to hide just as"+
                " the General\n shows up. He goes out to check the “wreckage” and"+
                " declares it to be a\n weather balloon. When he leaves the man"+
                " comes to get you and says\n the General took the decoy and will"+
                " announce that nothing\n “extraterrestrial” has happened. The "+
                "next day you manage to fix the\n communicator and contact your"+
                " parents. After the expected lecture and\n worrying, you get "+
                "them to walk you through how to fix the ship.\n Unfortunately,"+
                " you discover a crucial piece of equipment was taken by\n the "+
                "General along with the fake wreckage. What do you do?");
        hideBarnLabel.setFont(new Font(20));
        Button askParButton = new Button("Ask Parents to\n  Pick You Up");
        askParButton.setFont(new Font(20));
        askParButton.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
            primaryStage.setScene(askParScene);
        });
        Button askManButton = new Button("Ask the Man if You Can Stay With\n "+
                "      Him Until You Recover it");
        askManButton.setFont(new Font(20));
        askManButton.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
            primaryStage.setScene(askManScene);
        });
        HBox hideBarnButtonBox = new HBox(20);
        hideBarnButtonBox.setAlignment(Pos.CENTER);
        hideBarnButtonBox.getChildren().addAll(askParButton, askManButton);
        VBox hideBarnBox = new VBox(20);
        hideBarnBox.setAlignment(Pos.CENTER);
        hideBarnBox.setBackground(new Background(new BackgroundImage(new Image
                ("DesertBackground.jpg"), BackgroundRepeat.REPEAT,
                BackgroundRepeat.REPEAT, new BackgroundPosition(Side.LEFT, 0,
                false, Side.TOP, 0, false), new BackgroundSize(BackgroundSize.AUTO,
                BackgroundSize.AUTO, true, true, false, true))));
        hideBarnBox.getChildren().addAll(hideBarnLabel, hideBarnButtonBox);
        hideBarnScene = new Scene(hideBarnBox, 640, 530);

        Label dummyLabel = new Label("       You take an old pillow case from"+
                " the man’s house and dress\n it up to look like what they thought"+
                " the dummy should look like.\n When the General comes you are "+
                "laying amongst the wreckage\n trying your best to appear inanimate."+
                " But the General isn’t fooled\n and recognizes that you and the"+
                " wreckage are extraterrestrial. He\n calls in backup and they "+
                "sweep you and the wreckage up and\n take you to Area 51.\n\n  "+
                "                                         GAME OVER");
        dummyLabel.setFont(new Font(20));
        Button retryButton2 = new Button("Play Again");
        retryButton2.setFont(new Font(20));
        retryButton2.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
            primaryStage.setScene(titleScene);
        });
        VBox dummyBox = new VBox(20);
        dummyBox.setAlignment(Pos.CENTER);
        dummyBox.setBackground(new Background(new BackgroundImage(new Image
                ("DesertBackground.jpg"), BackgroundRepeat.REPEAT,
                BackgroundRepeat.REPEAT, new BackgroundPosition(Side.LEFT, 0,
                false, Side.TOP, 0, false), new BackgroundSize(BackgroundSize.AUTO,
                BackgroundSize.AUTO, true, true, false, true))));
        dummyBox.getChildren().addAll(dummyLabel, retryButton2);
        dummyScene = new Scene(dummyBox, 580, 435);

        Label talkGenLabel = new Label("       After your success with getting"+
                " the man on your side, you\n decide to try reasoning with the "+
                "General. When he arrives you\n have the man introduce you and "+
                "you explain your predicament.\n The General seems to listen, and"+
                " says he will return shortly.\n When he does, he has a team with"+
                " him who blow past the man\n and his family to grab you and your"+
                " ship and take you to Area\n 51.\n\n                        "+
                "                 GAME OVER");
        talkGenLabel.setFont(new Font(20));
        Button retryButton3 = new Button("Play Again");
        retryButton3.setFont(new Font(20));
        retryButton3.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
            primaryStage.setScene(titleScene);
        });
        VBox talkGenBox = new VBox(20);
        talkGenBox.setAlignment(Pos.CENTER);
        talkGenBox.setBackground(new Background(new BackgroundImage(new Image
                ("DesertBackground.jpg"), BackgroundRepeat.REPEAT,
                BackgroundRepeat.REPEAT, new BackgroundPosition(Side.LEFT, 0,
                false, Side.TOP, 0, false), new BackgroundSize(BackgroundSize.AUTO,
                BackgroundSize.AUTO, true, true, false, true))));
        talkGenBox.getChildren().addAll(talkGenLabel, retryButton3);
        talkGenScene = new Scene(talkGenBox, 580, 435);

        Label stayHidLabel = new Label("       You stay safely in the ship "+
                "while the Major comes to investigate\n your debris. When you "+
                "see him leave you gather up the courage to\n sneak close to the"+
                " building. You hear the residents talking again.\n They say the"+
                " Major is going to call a General to come and confiscate\n the"+
                " debris. When you make it back to your ship you take inventory\n"+
                " and look at the user manual. You recognize a crucial piece "+
                "of\n equipment from the pile of debris. What do you do?");
        stayHidLabel.setFont(new Font(20));
        Button stealRestButton = new Button("Steal the Rest\nof the Debris");
        stealRestButton.setFont(new Font(20));
        stealRestButton.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
            primaryStage.setScene(stealRestScene);
        });
        Button stealPartButton = new Button("Steal Only\n  the Part");
        stealPartButton.setFont(new Font(20));
        stealPartButton.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
            primaryStage.setScene(stealPartScene);
        });
        Button folGenButton = new Button("Follow the\n  General");
        folGenButton.setFont(new Font(20));
        folGenButton.addEventHandler(MouseEvent.MOUSE_CLICKED, event ->{
            primaryStage.setScene(folGenScene);
        });
        HBox stayHidButtonBox = new HBox(20);
        stayHidButtonBox.setAlignment(Pos.CENTER);
        stayHidButtonBox.getChildren().addAll(stealRestButton, stealPartButton,
                folGenButton);
        VBox stayHidBox = new VBox(20);
        stayHidBox.setAlignment(Pos.CENTER);
        stayHidBox.setBackground(new Background(new BackgroundImage(new Image
                ("DesertBackground.jpg"), BackgroundRepeat.REPEAT,
                BackgroundRepeat.REPEAT, new BackgroundPosition(Side.LEFT, 0,
                false, Side.TOP, 0, false), new BackgroundSize(BackgroundSize.AUTO,
                BackgroundSize.AUTO, true, true, false, true))));
        stayHidBox.getChildren().addAll(stayHidLabel, stayHidButtonBox);
        stayHidScene = new Scene(stayHidBox, 620, 465);

        Label stealDebLabel = new Label("       You sneak into the building in"+
                " the middle of the night while\n the residents are asleep and "+
                "steal every piece of the debris you\n can see. In the morning "+
                "you can hear from the safety of your\n ship that they are "+
                "confused. But when the Major shows up they\n reveal that you "+
                "left a piece behind. With this evidence the Major\n says he will"+
                " bring back a crew to search for the thief that took\n the rest"+
                " of the debris. What do you do?");
        stealDebLabel.setFont(new Font(20));
        Button moveShipButton = new Button("Move the Ship");
        moveShipButton.setFont(new Font(20));
        moveShipButton.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
            primaryStage.setScene(moveShipScene);
        });
        Button stayPutButton = new Button("Stay Put and Rush Repairs");
        stayPutButton.setFont(new Font(20));
        stayPutButton.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
            primaryStage.setScene(stayPutScene);
        });
        HBox stealDebButtonBox = new HBox(20);
        stealDebButtonBox.setAlignment(Pos.CENTER);
        stealDebButtonBox.getChildren().addAll(moveShipButton, stayPutButton);
        VBox stealDebBox = new VBox(20);
        stealDebBox.setAlignment(Pos.CENTER);
        stealDebBox.setBackground(new Background(new BackgroundImage(new Image
                ("DesertBackground.jpg"), BackgroundRepeat.REPEAT,
                BackgroundRepeat.REPEAT, new BackgroundPosition(Side.LEFT, 0,
                false, Side.TOP, 0, false), new BackgroundSize(BackgroundSize.AUTO,
                BackgroundSize.AUTO, true, true, false, true))));
        stealDebBox.getChildren().addAll(stealDebLabel, stealDebButtonBox);
        stealDebScene = new Scene(stealDebBox, 580, 435);



        Label askParLabel = new Label("       Your parents agree to come pick"+
                " you up in a friend’s ship. When the\n night comes you see their"+
                " ship arrive in the distance but it is quickly\n shot down with"+
                " missiles. You watch in horror as their ship also crashes\n to"+
                " Earth. The next morning the US Government puts out an alert"+
                " that\n there was a failed weather balloon test and there was "+
                "nothing for the\n humans to worry about. Uncertain about your "+
                "next move and grieving\n your parents, no one in the house "+
                "notices as military vehicles pull up\n outside. It appears that"+
                " with the discovery of the ship your parents\n came in they "+
                "decided to recheck the man’s house to see if he was\n hiding "+
                "something. Caught off guard they find you easily and take you\n"+
                " into custody.\n\n                                          "+
                "      GAME OVER");
        askParLabel.setFont(new Font(20));
        Button retryButton4 = new Button("Play Again");
        retryButton4.setFont(new Font(20));
        retryButton4.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
            primaryStage.setScene(titleScene);
        });
        VBox askParBox = new VBox(20);
        askParBox.setAlignment(Pos.CENTER);
        askParBox.setBackground(new Background(new BackgroundImage(new Image
                ("DesertBackground.jpg"), BackgroundRepeat.REPEAT,
                BackgroundRepeat.REPEAT, new BackgroundPosition(Side.LEFT, 0,
                false, Side.TOP, 0, false), new BackgroundSize(BackgroundSize.AUTO,
                BackgroundSize.AUTO, true, true, false, true))));
        askParBox.getChildren().addAll(askParLabel, retryButton4);
        askParScene = new Scene(askParBox, 640, 480);

        Label askManLabel = new Label("        After hearing some stories "+
                "from the man’s family of how the US Government\n works you "+
                "decide laying low is the best option. You tell your parents "+
                "that they have\n to leave without you, but you will be back "+
                "once you can find the part again. They\n reluctantly agree after"+
                " you convince them that avoiding capture is more important "+
                "\nthan being rescued. Years pass and you see no opportunity to"+
                " look for the piece. In\n 1978 people start talking about your"+
                " story again. Those who lived in the area started\n talking to"+
                " the press about seeing something unusual around the time of"+
                " your crash.\n You ask the man’s children to help spread the "+
                "story as well. In the 2010’s the man’s\n children teach you how"+
                " to use the internet, which you use to try and keep your story"+
                "\n alive and spread distrust in the government. This comes to "+
                "a head in 2019. You\n assess the people currently active on the"+
                " internet and decide it’s likely they will help\n you. You start"+
                " an event on Facebook titled:\n\n                               "+
                "   “Storm Area 51, They Can’t Stop All Of Us.”");
        askManLabel.setFont(new Font(20));
        Button nextButton = new Button("Next");
        nextButton.setFont(new Font(20));
        nextButton.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
            primaryStage.setScene(nextScene);
        });
        VBox askManBox = new VBox(20);
        askManBox.setAlignment(Pos.CENTER);
        askManBox.setBackground(new Background(new BackgroundImage(new Image
                ("DesertBackground.jpg"), BackgroundRepeat.REPEAT,
                BackgroundRepeat.REPEAT, new BackgroundPosition(Side.LEFT, 0,
                false, Side.TOP, 0, false), new BackgroundSize(BackgroundSize.AUTO,
                BackgroundSize.AUTO, true, true, false, true))));
        askManBox.getChildren().addAll(askManLabel, nextButton);
        askManScene = new Scene(askManBox, 760, 570);

        Label nextLabel = new Label("        Over the coming months your "+
                "event picks up speed and has become a\n “meme,” which causes "+
                "it to exponentially increase in popularity. When the day\n comes"+
                " 6,000 humans show up hoping to see aliens. You use their "+
                "celebrations\n as a distraction to sneak into the facility. Once"+
                " inside, you see a room dedicated\n to your crash and luckily "+
                "find the piece of your ship among a pile of failed\n replicas."+
                " You sneak back out without much trouble, only meeting a guard"+
                " at the\n back fence who escorts you back to the festivities to"+
                " keep you out of trouble.\n Once the “raid” ends and everyone "+
                "goes home you manage to fit the essential\n piece into your ship"+
                " and the engine revs to life. You thank the man’s family for"+
                "\n their kindness and take off, heading straight for home.\n\n"+
                "                                        Congratulations! "+
                "You Escaped!");
        nextLabel.setFont(new Font(20));
        Button retryButton5 = new Button("Play Again");
        retryButton5.setFont(new Font(20));
        retryButton5.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
            primaryStage.setScene(titleScene);
        });
        VBox nextBox = new VBox(20);
        nextBox.setAlignment(Pos.CENTER);
        nextBox.setBackground(new Background(new BackgroundImage(new Image
                ("DesertBackground.jpg"), BackgroundRepeat.REPEAT,
                BackgroundRepeat.REPEAT, new BackgroundPosition(Side.LEFT, 0,
                false, Side.TOP, 0, false), new BackgroundSize(BackgroundSize.AUTO,
                BackgroundSize.AUTO, true, true, false, true))));
        nextBox.getChildren().addAll(nextLabel, retryButton5);
        nextScene = new Scene(nextBox, 720, 540);

        Label stealRestLabel = new Label("       You sneak into the building"+
                " in the middle of the night\n while the residents are asleep "+
                "and steal every piece of the\n debris you can see. As you turn"+
                " to leave you see one of the\n residents standing in front of "+
                "you. Before you can say anything\n they scream for one of the "+
                "others to call for help. You try to\n run past but the resident"+
                " grabs you. You struggle against them\n but you don’t escape "+
                "before the military shows up.\n\n                           "+
                "              GAME OVER");
        stealRestLabel.setFont(new Font(20));
        Button retryButton6 = new Button("Play Again");
        retryButton6.setFont(new Font(20));
        retryButton6.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
            primaryStage.setScene(titleScene);
        });
        VBox stealRestBox = new VBox(20);
        stealRestBox.setAlignment(Pos.CENTER);
        stealRestBox.setBackground(new Background(new BackgroundImage(new Image
                ("DesertBackground.jpg"), BackgroundRepeat.REPEAT,
                BackgroundRepeat.REPEAT, new BackgroundPosition(Side.LEFT, 0,
                false, Side.TOP, 0, false), new BackgroundSize(BackgroundSize.AUTO,
                BackgroundSize.AUTO, true, true, false, true))));
        stealRestBox.getChildren().addAll(stealRestLabel, retryButton6);
        stealRestScene = new Scene(stealRestBox, 560, 420);

        Label stealPartLabel = new Label("        You sneak into the building"+
                " in the middle of the night while the residents\n are asleep "+
                "and find the piece you need to make the ship work. As you "+
                "quickly\n slip out of the room you see one of the residents "+
                "coming down the stairs and\n narrowly avoid them. The next "+
                "morning you stick around the house to eavesdrop\n and you can "+
                "tell the residents don’t notice that the part is gone. They "+
                "say the\n Major is going to call a General to come and confiscate"+
                " the debris. Luckily, with\n some research in the user manual "+
                "you can tell that you have everything you\n need to fix the ship."+
                " You lay low and work quietly on repairs over the next few\n "+
                "days. The General comes and goes from the house without "+
                "taking notice of you.\n Eventually, you get the ship running "+
                "and manage to make a successful escape\n back to your parents."+
                "\n\n                                          Congratulations! "+
                "You Escaped!");
        stealPartLabel.setFont(new Font(20));
        Button retryButton7 = new Button("Play Again");
        retryButton7.setFont(new Font(20));
        retryButton7.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
            primaryStage.setScene(titleScene);
        });
        VBox stealPartBox = new VBox(20);
        stealPartBox.setAlignment(Pos.CENTER);
        stealPartBox.setBackground(new Background(new BackgroundImage(new Image
                ("DesertBackground.jpg"), BackgroundRepeat.REPEAT,
                BackgroundRepeat.REPEAT, new BackgroundPosition(Side.LEFT, 0,
                false, Side.TOP, 0, false), new BackgroundSize(BackgroundSize.AUTO,
                BackgroundSize.AUTO, true, true, false, true))));
        stealPartBox.getChildren().addAll(stealPartLabel, retryButton7);
        stealPartScene = new Scene(stealPartBox, 720, 540);

        Label folGenLabel = new Label("       The day the General is coming "+
                "you sneak up to the side of\n the building to prepare. While "+
                "he is inside looking at the debris\n you run over to his vehicle"+
                " and see a couple of empty boxes\n under a tarp in the back. "+
                "You crawl in and hide in one of the\n boxes that is furthest "+
                "in. After a while the General comes back\n and collects a few "+
                "of the other boxes and fills them with the\n debris. He packs "+
                "them back in and covers the whole back with\n the tarp. You "+
                "hear the vehicle rev up and feel it start to move.\n You climb"+
                " out of your box and search the others until you find\n the "+
                "part you need to make your ship run, but you are still in "+
                "the\n moving vehicle. What do you do?");
        folGenLabel.setFont(new Font(20));
        Button jumpOutButton = new Button("Jump Out");
        jumpOutButton.setFont(new Font(20));
        jumpOutButton.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
            primaryStage.setScene(jumpOutScene);
        });
        Button stayHidButton2 = new Button("Stay Hidden");
        stayHidButton2.setFont(new Font(20));
        stayHidButton2.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
            primaryStage.setScene(stayHid2Scene);
        });
        HBox folGenButtonBox = new HBox(20);
        folGenButtonBox.setAlignment(Pos.CENTER);
        folGenButtonBox.getChildren().addAll(jumpOutButton, stayHidButton2);
        VBox folGenBox = new VBox(20);
        folGenBox.setAlignment(Pos.CENTER);
        folGenBox.setBackground(new Background(new BackgroundImage(new Image
                ("DesertBackground.jpg"), BackgroundRepeat.REPEAT,
                BackgroundRepeat.REPEAT, new BackgroundPosition(Side.LEFT, 0,
                false, Side.TOP, 0, false), new BackgroundSize(BackgroundSize.AUTO,
                BackgroundSize.AUTO, true, true, false, true))));
        folGenBox.getChildren().addAll(folGenLabel, folGenButtonBox);
        folGenScene = new Scene(folGenBox, 580, 435);

        Label moveShipLabel = new Label("        You play around with the "+
                "ship’s controls and find that you can still\n manage low level"+
                " flight. With all necessary parts back in your possession,\n "+
                "you pack up and carefully maneuver the ship away from the "+
                "building and\n out into the open desert. You spend the next few"+
                " days digging through\n the user manual and fixing the "+
                "communicator and reinstalling the\n important parts from the "+
                "debris. Once the communicator is back up you\n manage to contact"+
                " your parents. After the expected lecture and\n worrying, you "+
                "get them to walk you through how to fix the ship. You\n spend "+
                "a few more days getting it working and it takes off just like new!"+
                "\n\n                                  Congratulations! "+
                "You Escaped!");
        moveShipLabel.setFont(new Font(20));
        Button retryButton8 = new Button("Play Again");
        retryButton8.setFont(new Font(20));
        retryButton8.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
            primaryStage.setScene(titleScene);
        });
        VBox moveShipBox = new VBox(20);
        moveShipBox.setAlignment(Pos.CENTER);
        moveShipBox.setBackground(new Background(new BackgroundImage(new Image
                ("DesertBackground.jpg"), BackgroundRepeat.REPEAT,
                BackgroundRepeat.REPEAT, new BackgroundPosition(Side.LEFT, 0,
                false, Side.TOP, 0, false), new BackgroundSize(BackgroundSize.AUTO,
                BackgroundSize.AUTO, true, true, false, true))));
        moveShipBox.getChildren().addAll(moveShipLabel, retryButton8);
        moveShipScene = new Scene(moveShipBox, 656, 492);

        Label stayPutLabel = new Label("       You try and rush through "+
                "getting the ship working again\n as you see more and more "+
                "armed humans showing up around\n the building. They spread out"+
                " and search the area around you.\n You struggle to work knowing"+
                " that they will eventually notice\n the ship there. However, "+
                "the day finally comes when one of\n the humans stumbles across"+
                " the cloaked ship and it is not\n long before you are surrounded"+
                " and captured by them.\n\n                           "+
                "              GAME OVER");
        stayPutLabel.setFont(new Font(20));
        Button retryButton9 = new Button("Play Again");
        retryButton9.setFont(new Font(20));
        retryButton9.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
            primaryStage.setScene(titleScene);
        });
        VBox stayPutBox = new VBox(20);
        stayPutBox.setAlignment(Pos.CENTER);
        stayPutBox.setBackground(new Background(new BackgroundImage(new Image
                ("DesertBackground.jpg"), BackgroundRepeat.REPEAT,
                BackgroundRepeat.REPEAT, new BackgroundPosition(Side.LEFT, 0,
                false, Side.TOP, 0, false), new BackgroundSize(BackgroundSize.AUTO,
                BackgroundSize.AUTO, true, true, false, true))));
        stayPutBox.getChildren().addAll(stayPutLabel, retryButton9);
        stayPutScene = new Scene(stayPutBox, 560, 420);



        Label jumpOutLabel = new Label("        You leap out of the moving"+
                " vehicle clutching your part. You\n roll on the ground from the"+
                " momentum and end up with some\n scrapes and bruises, but you "+
                "are otherwise unharmed. Thankfully\n you are not far off from "+
                "the building you landed at, so you are\n able to simply follow"+
                " the road back. You sneak back around to\n your ship and begin"+
                " the repair process. After a few days the\n engine revs to life"+
                " and you take off!\n\n                            "+
                "Congratulations! You Escaped!");
        jumpOutLabel.setFont(new Font(20));
        Button retryButton10 = new Button("Play Again");
        retryButton10.setFont(new Font(20));
        retryButton10.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
            primaryStage.setScene(titleScene);
        });
        VBox jumpOutBox = new VBox(20);
        jumpOutBox.setAlignment(Pos.CENTER);
        jumpOutBox.setBackground(new Background(new BackgroundImage(new Image
                ("DesertBackground.jpg"), BackgroundRepeat.REPEAT,
                BackgroundRepeat.REPEAT, new BackgroundPosition(Side.LEFT, 0,
                false, Side.TOP, 0, false), new BackgroundSize(BackgroundSize.AUTO,
                BackgroundSize.AUTO, true, true, false, true))));
        jumpOutBox.getChildren().addAll(jumpOutLabel, retryButton10);
        jumpOutScene = new Scene(jumpOutBox, 580, 435);

        Label stayHid2Label = new Label("       You stay put in your box as"+
                " the vehicle travels for an\n incredibly long time. When it "+
                "finally stops, you hear many\n voices around the vehicle. "+
                "Suddenly, the tarp is lifted and\n several humans start "+
                "unloading all the boxes, including yours.\n They quickly "+
                "realize your box is not empty and open it.\n Surrounded by the"+
                " humans you have no escape and are\n captured and taken inside."+
                "\n\n                           "+
                "             GAME OVER");
        stayHid2Label.setFont(new Font(20));
        Button retryButton11 = new Button("Play Again");
        retryButton11.setFont(new Font(20));
        retryButton11.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
            primaryStage.setScene(titleScene);
        });
        VBox stayHid2Box = new VBox(20);
        stayHid2Box.setAlignment(Pos.CENTER);
        stayHid2Box.setBackground(new Background(new BackgroundImage(new Image
                ("DesertBackground.jpg"), BackgroundRepeat.REPEAT,
                BackgroundRepeat.REPEAT, new BackgroundPosition(Side.LEFT, 0,
                false, Side.TOP, 0, false), new BackgroundSize(BackgroundSize.AUTO,
                BackgroundSize.AUTO, true, true, false, true))));
        stayHid2Box.getChildren().addAll(stayHid2Label, retryButton11);
        stayHid2Scene = new Scene(stayHid2Box, 560, 420);

        primaryStage.setScene(titleScene);
        primaryStage.show();
    }

    public void startWindow(String[] args){ launch(args); }
}
