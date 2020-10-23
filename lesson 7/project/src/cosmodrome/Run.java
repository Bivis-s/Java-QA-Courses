package cosmodrome;

import cosmodrome.carrirers.*;

public class Run {
    public static void main(String[] args) {
        Cosmodrome cosmodrome = new Cosmodrome();

        Shuttle shuttle = new Shuttle();
        SpaceX falcon9 = new SpaceX();
        RosCosmos protonM = new RosCosmos();

        cosmodrome.launch(shuttle);
        System.out.println();
        cosmodrome.launch(falcon9);
        System.out.println();
        cosmodrome.launch(protonM);
    }
}
