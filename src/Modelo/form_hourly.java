/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author INAMETCLIN-3
 */
public class form_hourly {
  private String stationId;
  private int elementId;
  private int yyyy;
  private int mm;
  private int dd; 
  
private String hh_00;
private String hh_01;
private String hh_02;
private String hh_03;
private String hh_04;
private String hh_05;
private String hh_06;
private String hh_07;
private String hh_08;
private String hh_09;
private String hh_10;
private String hh_11;
private String hh_12;
private String hh_13;
private String hh_14;
private String hh_15;
private String hh_16;
private String hh_17;
private String hh_18;
private String hh_19;
private String hh_20;
private String hh_21;
private String hh_22;
private String hh_23;

private String flag00;
private String flag02;
private String flag03;
private String flag04;
private String flag05;
private String flag06;
private String flag07;
private String flag08;
private String flag09;
private String flag10;
private String flag11;
private String flag12;
private String flag13;
private String flag14;
private String flag15;
private String flag16;
private String flag17;
private String flag18;
private String flag19;
private String flag20;
private String flag21;
private String flag22;
private String flag23;

private String total;
private String signature;
private int entryDatetime;

//construtiores 
    public form_hourly(String stationId, int elementId, int yyyy, int mm, int dd, String hh_00, String hh_01, String hh_02, String hh_03, String hh_04, String hh_05, String hh_06, String hh_07, String hh_08, String hh_09, String hh_10, String hh_11, String hh_12, String hh_13, String hh_14, String hh_15, String hh_16, String hh_17, String hh_18, String hh_19, String hh_20, String hh_21, String hh_22, String hh_23, String flag00, String flag02, String flag03, String flag04, String flag05, String flag06, String flag07, String flag08, String flag09, String flag10, String flag11, String flag12, String flag13, String flag14, String flag15, String flag16, String flag17, String flag18, String flag19, String flag20, String flag21, String flag22, String flag23, String total, String signature, int entryDatetime) {
        this.stationId = stationId;
        this.elementId = elementId;
        this.yyyy = yyyy;
        this.mm = mm;
        this.dd = dd;
        this.hh_00 = hh_00;
        this.hh_01 = hh_01;
        this.hh_02 = hh_02;
        this.hh_03 = hh_03;
        this.hh_04 = hh_04;
        this.hh_05 = hh_05;
        this.hh_06 = hh_06;
        this.hh_07 = hh_07;
        this.hh_08 = hh_08;
        this.hh_09 = hh_09;
        this.hh_10 = hh_10;
        this.hh_11 = hh_11;
        this.hh_12 = hh_12;
        this.hh_13 = hh_13;
        this.hh_14 = hh_14;
        this.hh_15 = hh_15;
        this.hh_16 = hh_16;
        this.hh_17 = hh_17;
        this.hh_18 = hh_18;
        this.hh_19 = hh_19;
        this.hh_20 = hh_20;
        this.hh_21 = hh_21;
        this.hh_22 = hh_22;
        this.hh_23 = hh_23;
        this.flag00 = flag00;
        this.flag02 = flag02;
        this.flag03 = flag03;
        this.flag04 = flag04;
        this.flag05 = flag05;
        this.flag06 = flag06;
        this.flag07 = flag07;
        this.flag08 = flag08;
        this.flag09 = flag09;
        this.flag10 = flag10;
        this.flag11 = flag11;
        this.flag12 = flag12;
        this.flag13 = flag13;
        this.flag14 = flag14;
        this.flag15 = flag15;
        this.flag16 = flag16;
        this.flag17 = flag17;
        this.flag18 = flag18;
        this.flag19 = flag19;
        this.flag20 = flag20;
        this.flag21 = flag21;
        this.flag22 = flag22;
        this.flag23 = flag23;
        this.total = total;
        this.signature = signature;
        this.entryDatetime = entryDatetime;
    }
//metodo get e set

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public int getElementId() {
        return elementId;
    }

    public void setElementId(int elementId) {
        this.elementId = elementId;
    }

    public int getYyyy() {
        return yyyy;
    }

    public void setYyyy(int yyyy) {
        this.yyyy = yyyy;
    }

    public int getMm() {
        return mm;
    }

    public void setMm(int mm) {
        this.mm = mm;
    }

    public int getDd() {
        return dd;
    }

    public void setDd(int dd) {
        this.dd = dd;
    }

    public String getHh_00() {
        return hh_00;
    }

    public void setHh_00(String hh_00) {
        this.hh_00 = hh_00;
    }

    public String getHh_01() {
        return hh_01;
    }

    public void setHh_01(String hh_01) {
        this.hh_01 = hh_01;
    }

    public String getHh_02() {
        return hh_02;
    }

    public void setHh_02(String hh_02) {
        this.hh_02 = hh_02;
    }

    public String getHh_03() {
        return hh_03;
    }

    public void setHh_03(String hh_03) {
        this.hh_03 = hh_03;
    }

    public String getHh_04() {
        return hh_04;
    }

    public void setHh_04(String hh_04) {
        this.hh_04 = hh_04;
    }

    public String getHh_05() {
        return hh_05;
    }

    public void setHh_05(String hh_05) {
        this.hh_05 = hh_05;
    }

    public String getHh_06() {
        return hh_06;
    }

    public void setHh_06(String hh_06) {
        this.hh_06 = hh_06;
    }

    public String getHh_07() {
        return hh_07;
    }

    public void setHh_07(String hh_07) {
        this.hh_07 = hh_07;
    }

    public String getHh_08() {
        return hh_08;
    }

    public void setHh_08(String hh_08) {
        this.hh_08 = hh_08;
    }

    public String getHh_09() {
        return hh_09;
    }

    public void setHh_09(String hh_09) {
        this.hh_09 = hh_09;
    }

    public String getHh_10() {
        return hh_10;
    }

    public void setHh_10(String hh_10) {
        this.hh_10 = hh_10;
    }

    public String getHh_11() {
        return hh_11;
    }

    public void setHh_11(String hh_11) {
        this.hh_11 = hh_11;
    }

    public String getHh_12() {
        return hh_12;
    }

    public void setHh_12(String hh_12) {
        this.hh_12 = hh_12;
    }

    public String getHh_13() {
        return hh_13;
    }

    public void setHh_13(String hh_13) {
        this.hh_13 = hh_13;
    }

    public String getHh_14() {
        return hh_14;
    }

    public void setHh_14(String hh_14) {
        this.hh_14 = hh_14;
    }

    public String getHh_15() {
        return hh_15;
    }

    public void setHh_15(String hh_15) {
        this.hh_15 = hh_15;
    }

    public String getHh_16() {
        return hh_16;
    }

    public void setHh_16(String hh_16) {
        this.hh_16 = hh_16;
    }

    public String getHh_17() {
        return hh_17;
    }

    public void setHh_17(String hh_17) {
        this.hh_17 = hh_17;
    }

    public String getHh_18() {
        return hh_18;
    }

    public void setHh_18(String hh_18) {
        this.hh_18 = hh_18;
    }

    public String getHh_19() {
        return hh_19;
    }

    public void setHh_19(String hh_19) {
        this.hh_19 = hh_19;
    }

    public String getHh_20() {
        return hh_20;
    }

    public void setHh_20(String hh_20) {
        this.hh_20 = hh_20;
    }

    public String getHh_21() {
        return hh_21;
    }

    public void setHh_21(String hh_21) {
        this.hh_21 = hh_21;
    }

    public String getHh_22() {
        return hh_22;
    }

    public void setHh_22(String hh_22) {
        this.hh_22 = hh_22;
    }

    public String getHh_23() {
        return hh_23;
    }

    public void setHh_23(String hh_23) {
        this.hh_23 = hh_23;
    }

    public String getFlag00() {
        return flag00;
    }

    public void setFlag00(String flag00) {
        this.flag00 = flag00;
    }

    public String getFlag02() {
        return flag02;
    }

    public void setFlag02(String flag02) {
        this.flag02 = flag02;
    }

    public String getFlag03() {
        return flag03;
    }

    public void setFlag03(String flag03) {
        this.flag03 = flag03;
    }

    public String getFlag04() {
        return flag04;
    }

    public void setFlag04(String flag04) {
        this.flag04 = flag04;
    }

    public String getFlag05() {
        return flag05;
    }

    public void setFlag05(String flag05) {
        this.flag05 = flag05;
    }

    public String getFlag06() {
        return flag06;
    }

    public void setFlag06(String flag06) {
        this.flag06 = flag06;
    }

    public String getFlag07() {
        return flag07;
    }

    public void setFlag07(String flag07) {
        this.flag07 = flag07;
    }

    public String getFlag08() {
        return flag08;
    }

    public void setFlag08(String flag08) {
        this.flag08 = flag08;
    }

    public String getFlag09() {
        return flag09;
    }

    public void setFlag09(String flag09) {
        this.flag09 = flag09;
    }

    public String getFlag10() {
        return flag10;
    }

    public void setFlag10(String flag10) {
        this.flag10 = flag10;
    }

    public String getFlag11() {
        return flag11;
    }

    public void setFlag11(String flag11) {
        this.flag11 = flag11;
    }

    public String getFlag12() {
        return flag12;
    }

    public void setFlag12(String flag12) {
        this.flag12 = flag12;
    }

    public String getFlag13() {
        return flag13;
    }

    public void setFlag13(String flag13) {
        this.flag13 = flag13;
    }

    public String getFlag14() {
        return flag14;
    }

    public void setFlag14(String flag14) {
        this.flag14 = flag14;
    }

    public String getFlag15() {
        return flag15;
    }

    public void setFlag15(String flag15) {
        this.flag15 = flag15;
    }

    public String getFlag16() {
        return flag16;
    }

    public void setFlag16(String flag16) {
        this.flag16 = flag16;
    }

    public String getFlag17() {
        return flag17;
    }

    public void setFlag17(String flag17) {
        this.flag17 = flag17;
    }

    public String getFlag18() {
        return flag18;
    }

    public void setFlag18(String flag18) {
        this.flag18 = flag18;
    }

    public String getFlag19() {
        return flag19;
    }

    public void setFlag19(String flag19) {
        this.flag19 = flag19;
    }

    public String getFlag20() {
        return flag20;
    }

    public void setFlag20(String flag20) {
        this.flag20 = flag20;
    }

    public String getFlag21() {
        return flag21;
    }

    public void setFlag21(String flag21) {
        this.flag21 = flag21;
    }

    public String getFlag22() {
        return flag22;
    }

    public void setFlag22(String flag22) {
        this.flag22 = flag22;
    }

    public String getFlag23() {
        return flag23;
    }

    public void setFlag23(String flag23) {
        this.flag23 = flag23;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public int getEntryDatetime() {
        return entryDatetime;
    }

    public void setEntryDatetime(int entryDatetime) {
        this.entryDatetime = entryDatetime;
    }

}
