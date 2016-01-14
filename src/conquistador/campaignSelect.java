package conquistador;

import conquistador.campaigns.beginings.*;

public class campaignSelect implements Runnable {

    mission1 Mission1 = new mission1();
    state lp = new state("Lalitpur", 10, true);
    //state arbitary=new state("Arbitary",0,false);
    boolean missionCompletion = false;
    Thread t;

    public campaignSelect() {
        t=new Thread(this,"Campaign");
        t.start();
    }

    public void run() {
        while (lp.f.running()) {
            try {
                Thread.sleep(500);
                lp.f.returnInfo(lp);
                //Mission2.changeComputerStatus(arbitary);
                missionCompletion = Mission1.missionCompletion(lp);
                if (missionCompletion) {
                    lp.f.runFlag = false;
                    lp.f.displayStatus("Mission Accomplished");
                }
            } catch (InterruptedException ex) {
            }
        }

    }
}
