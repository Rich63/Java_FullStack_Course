package org.studyeasy.laptop;

import org.studyeasy.laptop.components.Processor;

import org.studyeasy.laptop.components.GraphicsCard;

public class Laptop {
  private float screen;
  private Processor processor;  // This is what Composition is all about
  private String ram;
  private String hardDrive1;
  private String hardDrive2;
  private GraphicsCard graphicsCard;  // This is what Composition is all about
  private String opticalDrive;
  private String keyboard;
  
  public Laptop() {
    this.screen = 15.6f;
    this.processor = new Processor();  // This is what Composition is all about
    this.ram = "DDR4";
    this.hardDrive1 = "ssd 240GB";
    this.hardDrive2 = "SATA 1TB";
    this.graphicsCard = new GraphicsCard();  // This is what Composition is all about
    this.opticalDrive = "MLT Layer";
    this.keyboard = "backlit";
  }

  public Laptop(float screen, Processor processor, String ram, String hardDrive1, String hardDrive2,
      GraphicsCard graphicsCard, String opticalDrive, String keyboard) {
    this.screen = screen;
    this.processor = processor;
    this.ram = ram;
    this.hardDrive1 = hardDrive1;
    this.hardDrive2 = hardDrive2;
    this.graphicsCard = graphicsCard;
    this.opticalDrive = opticalDrive;
    this.keyboard = keyboard;
  }

  public Processor getProcessor() {
    return processor;
  }
  
  public GraphicsCard getGraphicsCard() {
    return graphicsCard;
  }

  public float getScreen() {
    return screen;
  }

  public String getRam() {
    return ram;
  }

  public String getHardDrive1() {
    return hardDrive1;
  }

  public String getHardDrive2() {
    return hardDrive2;
  }

  public String getOpticalDrive() {
    return opticalDrive;
  }

  public String getKeyboard() {
    return keyboard;
  }

  public String gamingMode() {
    processor.setFrequency(processor.getMaxFrequency());
    return "Successfully set to maxFrequency!";
  }

  @Override
  public String toString() {
    return "Laptop [screen=" + screen + ", processor=" + processor + ", ram=" + ram + ", hardDrive1=" + hardDrive1
        + ", hardDrive2=" + hardDrive2 + ", graphicsCard=" + graphicsCard + ", opticalDrive=" + opticalDrive
        + ", keyboard=" + keyboard + "]";
  }

}
