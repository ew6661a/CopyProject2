public class Moral {
    public static void main(String[] args) {
        int scenarioContext = Generator.getScenario();
        String changeLaneGroup = Generator.getGroup();
        String currentLaneGroup = Generator.getGroup();

        int currentLaneLives = currentLaneGroup.length();
        int changeLaneLives = changeLaneGroup.length();

        public static boolean decideSwerve(int scenarioContext, String currentLaneGroup, String changeLaneGroup) {
            boolean decideSwerve;
            if (Generator.currentLaneLives >= Generator.changeLaneLives) {
                return false;
            }
            else {
                return true;
            }
        }

/*

            public static int factorScenario(int scenarioContext){
                if (scenarioContext >=  10){

                }
                else if{

                }
               // return false
            }

            // return true / false
        }

        public static void scenario
            System.out.print(Generator.getScenario());
            System.out.print(Generator.getGroup());
         True False outputs for each argument
         Use & identify at least four of the moral measurements as criteria

         Integer Argument: Scenario in Range 0-22
         String Argument: Group killed if car stays in current lane
         String Argument: Group killed if car swerves into other lane
        */
    }
}