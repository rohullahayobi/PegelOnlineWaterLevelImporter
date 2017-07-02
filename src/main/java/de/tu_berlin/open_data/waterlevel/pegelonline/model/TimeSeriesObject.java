package de.tu_berlin.open_data.waterlevel.pegelonline.model;

/**
 * Created by ahmadjawid on 7/2/17.
 */
public class TimeSeriesObject {

    private String shortname;
    private String longname;
    private String unit;
    private int equidistance;
    private Measurement currentMeasurement;
    private GaugeZero gaugeZero;

    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    public String getLongname() {
        return longname;
    }

    public void setLongname(String longname) {
        this.longname = longname;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getEquidistance() {
        return equidistance;
    }

    public void setEquidistance(int equidistance) {
        this.equidistance = equidistance;
    }

    public Measurement getCurrentMeasurement() {
        return currentMeasurement;
    }

    public void setCurrentMeasurement(Measurement currentMeasurement) {
        this.currentMeasurement = currentMeasurement;
    }

    public GaugeZero getGaugeZero() {
        return gaugeZero;
    }

    public void setGaugeZero(GaugeZero gaugeZero) {
        this.gaugeZero = gaugeZero;
    }
}
