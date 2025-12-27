package adapter;

import computer.HDMI;
import computer.TV;
import computer.VGA;

public class HdmiVgaAdapterHeritage extends TV implements VGA {

    @Override
    public void print(String message) {
        System.out.println("----------- Adapter ------------");
        byte[] data = message.getBytes();
        super.view(data);
        System.out.println("----------- Adapter ------------");
    }

}
