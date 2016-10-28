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
public class form_daily2 {
   private String stationId;
   private int elementId;
   private int yyyy;
   private int mm;
   private int hh;
   
private String day01;
private String day02;
private String day03;
private String day04;
private String day05;
private String day06;
private String day07;
private String day08;
private String day09;
private String day10;
private String day11;
private String day12;
private String day13;
private String day14;
private String day15;
private String day16;
private String day17;
private String day18;
private String day19;
private String day20;
private String day21;
private String day22;
private String day23;
private String day24;
private String day25;
private String day26;
private String day27;
private String day28;
private String day29;
private String day30;
private String day31;

private String flag01;
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
private String flag16;
private String flag17;
private String flag18;
private String flag19;
private String flag20;
private String flag21;
private String flag22;
private String flag23;
private String flag24;
private String flag25;
private String flag26;
private String flag27;
private String flag28;
private String flag29;
private String flag30;
private String flag31;

private String period01;
private String period02;
private String period03;
private String period04;
private String period05;
private String period06;
private String period07;
private String period08;
private String period09;
private String period10;
private String period11;
private String period12;
private String period13;
private String period14;
private String period15;
private String period16;
private String period17;
private String period18;
private String period19;
private String period20;
private String period21;
private String period22;
private String period23;
private String period24;
private String period25;
private String period26;
private String period27;
private String period28;
private String period29;
private String period30;
private String period31;

private String total;
private String signature;
private String temperaturaUnits;
private String precipUnits;
private String cloudHeightUnites;
private String visUnits;
private int entryDatetime;

//construtores
    public form_daily2(String stationId, int elementId, int yyyy, int mm, int hh, String day01, String day02, String day03, String day04, String day05, String day06, String day07, String day08, String day09, String day10, String day11, String day12, String day13, String day14, String day15, String day16, String day17, String day18, String day19, String day20, String day21, String day22, String day23, String day24, String day25, String day26, String day27, String day28, String day29, String day30, String day31, String flag01, String flag02, String flag03, String flag04, String flag05, String flag06, String flag07, String flag08, String flag09, String flag10, String flag11, String flag12, String flag13, String flag14, String flag16, String flag17, String flag18, String flag19, String flag20, String flag21, String flag22, String flag23, String flag24, String flag25, String flag26, String flag27, String flag28, String flag29, String flag30, String flag31, String period01, String period02, String period03, String period04, String period05, String period06, String period07, String period08, String period09, String period10, String period11, String period12, String period13, String period14, String period15, String period16, String period17, String period18, String period19, String period20, String period21, String period22, String period23, String period24, String period25, String period26, String period27, String period28, String period29, String period30, String period31, String total, String signature, String temperaturaUnits, String precipUnits, String cloudHeightUnites, String visUnits, int entryDatetime) {
        this.stationId = stationId;
        this.elementId = elementId;
        this.yyyy = yyyy;
        this.mm = mm;
        this.hh = hh;
        this.day01 = day01;
        this.day02 = day02;
        this.day03 = day03;
        this.day04 = day04;
        this.day05 = day05;
        this.day06 = day06;
        this.day07 = day07;
        this.day08 = day08;
        this.day09 = day09;
        this.day10 = day10;
        this.day11 = day11;
        this.day12 = day12;
        this.day13 = day13;
        this.day14 = day14;
        this.day15 = day15;
        this.day16 = day16;
        this.day17 = day17;
        this.day18 = day18;
        this.day19 = day19;
        this.day20 = day20;
        this.day21 = day21;
        this.day22 = day22;
        this.day23 = day23;
        this.day24 = day24;
        this.day25 = day25;
        this.day26 = day26;
        this.day27 = day27;
        this.day28 = day28;
        this.day29 = day29;
        this.day30 = day30;
        this.day31 = day31;
        this.flag01 = flag01;
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
        this.flag16 = flag16;
        this.flag17 = flag17;
        this.flag18 = flag18;
        this.flag19 = flag19;
        this.flag20 = flag20;
        this.flag21 = flag21;
        this.flag22 = flag22;
        this.flag23 = flag23;
        this.flag24 = flag24;
        this.flag25 = flag25;
        this.flag26 = flag26;
        this.flag27 = flag27;
        this.flag28 = flag28;
        this.flag29 = flag29;
        this.flag30 = flag30;
        this.flag31 = flag31;
        this.period01 = period01;
        this.period02 = period02;
        this.period03 = period03;
        this.period04 = period04;
        this.period05 = period05;
        this.period06 = period06;
        this.period07 = period07;
        this.period08 = period08;
        this.period09 = period09;
        this.period10 = period10;
        this.period11 = period11;
        this.period12 = period12;
        this.period13 = period13;
        this.period14 = period14;
        this.period15 = period15;
        this.period16 = period16;
        this.period17 = period17;
        this.period18 = period18;
        this.period19 = period19;
        this.period20 = period20;
        this.period21 = period21;
        this.period22 = period22;
        this.period23 = period23;
        this.period24 = period24;
        this.period25 = period25;
        this.period26 = period26;
        this.period27 = period27;
        this.period28 = period28;
        this.period29 = period29;
        this.period30 = period30;
        this.period31 = period31;
        this.total = total;
        this.signature = signature;
        this.temperaturaUnits = temperaturaUnits;
        this.precipUnits = precipUnits;
        this.cloudHeightUnites = cloudHeightUnites;
        this.visUnits = visUnits;
        this.entryDatetime = entryDatetime;
    }

//metodos guete e set//
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

    public int getHh() {
        return hh;
    }

    public void setHh(int hh) {
        this.hh = hh;
    }

    public String getDay01() {
        return day01;
    }

    public void setDay01(String day01) {
        this.day01 = day01;
    }

    public String getDay02() {
        return day02;
    }

    public void setDay02(String day02) {
        this.day02 = day02;
    }

    public String getDay03() {
        return day03;
    }

    public void setDay03(String day03) {
        this.day03 = day03;
    }

    public String getDay04() {
        return day04;
    }

    public void setDay04(String day04) {
        this.day04 = day04;
    }

    public String getDay05() {
        return day05;
    }

    public void setDay05(String day05) {
        this.day05 = day05;
    }

    public String getDay06() {
        return day06;
    }

    public void setDay06(String day06) {
        this.day06 = day06;
    }

    public String getDay07() {
        return day07;
    }

    public void setDay07(String day07) {
        this.day07 = day07;
    }

    public String getDay08() {
        return day08;
    }

    public void setDay08(String day08) {
        this.day08 = day08;
    }

    public String getDay09() {
        return day09;
    }

    public void setDay09(String day09) {
        this.day09 = day09;
    }

    public String getDay10() {
        return day10;
    }

    public void setDay10(String day10) {
        this.day10 = day10;
    }

    public String getDay11() {
        return day11;
    }

    public void setDay11(String day11) {
        this.day11 = day11;
    }

    public String getDay12() {
        return day12;
    }

    public void setDay12(String day12) {
        this.day12 = day12;
    }

    public String getDay13() {
        return day13;
    }

    public void setDay13(String day13) {
        this.day13 = day13;
    }

    public String getDay14() {
        return day14;
    }

    public void setDay14(String day14) {
        this.day14 = day14;
    }

    public String getDay15() {
        return day15;
    }

    public void setDay15(String day15) {
        this.day15 = day15;
    }

    public String getDay16() {
        return day16;
    }

    public void setDay16(String day16) {
        this.day16 = day16;
    }

    public String getDay17() {
        return day17;
    }

    public void setDay17(String day17) {
        this.day17 = day17;
    }

    public String getDay18() {
        return day18;
    }

    public void setDay18(String day18) {
        this.day18 = day18;
    }

    public String getDay19() {
        return day19;
    }

    public void setDay19(String day19) {
        this.day19 = day19;
    }

    public String getDay20() {
        return day20;
    }

    public void setDay20(String day20) {
        this.day20 = day20;
    }

    public String getDay21() {
        return day21;
    }

    public void setDay21(String day21) {
        this.day21 = day21;
    }

    public String getDay22() {
        return day22;
    }

    public void setDay22(String day22) {
        this.day22 = day22;
    }

    public String getDay23() {
        return day23;
    }

    public void setDay23(String day23) {
        this.day23 = day23;
    }

    public String getDay24() {
        return day24;
    }

    public void setDay24(String day24) {
        this.day24 = day24;
    }

    public String getDay25() {
        return day25;
    }

    public void setDay25(String day25) {
        this.day25 = day25;
    }

    public String getDay26() {
        return day26;
    }

    public void setDay26(String day26) {
        this.day26 = day26;
    }

    public String getDay27() {
        return day27;
    }

    public void setDay27(String day27) {
        this.day27 = day27;
    }

    public String getDay28() {
        return day28;
    }

    public void setDay28(String day28) {
        this.day28 = day28;
    }

    public String getDay29() {
        return day29;
    }

    public void setDay29(String day29) {
        this.day29 = day29;
    }

    public String getDay30() {
        return day30;
    }

    public void setDay30(String day30) {
        this.day30 = day30;
    }

    public String getDay31() {
        return day31;
    }

    public void setDay31(String day31) {
        this.day31 = day31;
    }

    public String getFlag01() {
        return flag01;
    }

    public void setFlag01(String flag01) {
        this.flag01 = flag01;
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

    public String getFlag24() {
        return flag24;
    }

    public void setFlag24(String flag24) {
        this.flag24 = flag24;
    }

    public String getFlag25() {
        return flag25;
    }

    public void setFlag25(String flag25) {
        this.flag25 = flag25;
    }

    public String getFlag26() {
        return flag26;
    }

    public void setFlag26(String flag26) {
        this.flag26 = flag26;
    }

    public String getFlag27() {
        return flag27;
    }

    public void setFlag27(String flag27) {
        this.flag27 = flag27;
    }

    public String getFlag28() {
        return flag28;
    }

    public void setFlag28(String flag28) {
        this.flag28 = flag28;
    }

    public String getFlag29() {
        return flag29;
    }

    public void setFlag29(String flag29) {
        this.flag29 = flag29;
    }

    public String getFlag30() {
        return flag30;
    }

    public void setFlag30(String flag30) {
        this.flag30 = flag30;
    }

    public String getFlag31() {
        return flag31;
    }

    public void setFlag31(String flag31) {
        this.flag31 = flag31;
    }

    public String getPeriod01() {
        return period01;
    }

    public void setPeriod01(String period01) {
        this.period01 = period01;
    }

    public String getPeriod02() {
        return period02;
    }

    public void setPeriod02(String period02) {
        this.period02 = period02;
    }

    public String getPeriod03() {
        return period03;
    }

    public void setPeriod03(String period03) {
        this.period03 = period03;
    }

    public String getPeriod04() {
        return period04;
    }

    public void setPeriod04(String period04) {
        this.period04 = period04;
    }

    public String getPeriod05() {
        return period05;
    }

    public void setPeriod05(String period05) {
        this.period05 = period05;
    }

    public String getPeriod06() {
        return period06;
    }

    public void setPeriod06(String period06) {
        this.period06 = period06;
    }

    public String getPeriod07() {
        return period07;
    }

    public void setPeriod07(String period07) {
        this.period07 = period07;
    }

    public String getPeriod08() {
        return period08;
    }

    public void setPeriod08(String period08) {
        this.period08 = period08;
    }

    public String getPeriod09() {
        return period09;
    }

    public void setPeriod09(String period09) {
        this.period09 = period09;
    }

    public String getPeriod10() {
        return period10;
    }

    public void setPeriod10(String period10) {
        this.period10 = period10;
    }

    public String getPeriod11() {
        return period11;
    }

    public void setPeriod11(String period11) {
        this.period11 = period11;
    }

    public String getPeriod12() {
        return period12;
    }

    public void setPeriod12(String period12) {
        this.period12 = period12;
    }

    public String getPeriod13() {
        return period13;
    }

    public void setPeriod13(String period13) {
        this.period13 = period13;
    }

    public String getPeriod14() {
        return period14;
    }

    public void setPeriod14(String period14) {
        this.period14 = period14;
    }

    public String getPeriod15() {
        return period15;
    }

    public void setPeriod15(String period15) {
        this.period15 = period15;
    }

    public String getPeriod16() {
        return period16;
    }

    public void setPeriod16(String period16) {
        this.period16 = period16;
    }

    public String getPeriod17() {
        return period17;
    }

    public void setPeriod17(String period17) {
        this.period17 = period17;
    }

    public String getPeriod18() {
        return period18;
    }

    public void setPeriod18(String period18) {
        this.period18 = period18;
    }

    public String getPeriod19() {
        return period19;
    }

    public void setPeriod19(String period19) {
        this.period19 = period19;
    }

    public String getPeriod20() {
        return period20;
    }

    public void setPeriod20(String period20) {
        this.period20 = period20;
    }

    public String getPeriod21() {
        return period21;
    }

    public void setPeriod21(String period21) {
        this.period21 = period21;
    }

    public String getPeriod22() {
        return period22;
    }

    public void setPeriod22(String period22) {
        this.period22 = period22;
    }

    public String getPeriod23() {
        return period23;
    }

    public void setPeriod23(String period23) {
        this.period23 = period23;
    }

    public String getPeriod24() {
        return period24;
    }

    public void setPeriod24(String period24) {
        this.period24 = period24;
    }

    public String getPeriod25() {
        return period25;
    }

    public void setPeriod25(String period25) {
        this.period25 = period25;
    }

    public String getPeriod26() {
        return period26;
    }

    public void setPeriod26(String period26) {
        this.period26 = period26;
    }

    public String getPeriod27() {
        return period27;
    }

    public void setPeriod27(String period27) {
        this.period27 = period27;
    }

    public String getPeriod28() {
        return period28;
    }

    public void setPeriod28(String period28) {
        this.period28 = period28;
    }

    public String getPeriod29() {
        return period29;
    }

    public void setPeriod29(String period29) {
        this.period29 = period29;
    }

    public String getPeriod30() {
        return period30;
    }

    public void setPeriod30(String period30) {
        this.period30 = period30;
    }

    public String getPeriod31() {
        return period31;
    }

    public void setPeriod31(String period31) {
        this.period31 = period31;
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

    public String getTemperaturaUnits() {
        return temperaturaUnits;
    }

    public void setTemperaturaUnits(String temperaturaUnits) {
        this.temperaturaUnits = temperaturaUnits;
    }

    public String getPrecipUnits() {
        return precipUnits;
    }

    public void setPrecipUnits(String precipUnits) {
        this.precipUnits = precipUnits;
    }

    public String getCloudHeightUnites() {
        return cloudHeightUnites;
    }

    public void setCloudHeightUnites(String cloudHeightUnites) {
        this.cloudHeightUnites = cloudHeightUnites;
    }

    public String getVisUnits() {
        return visUnits;
    }

    public void setVisUnits(String visUnits) {
        this.visUnits = visUnits;
    }

    public int getEntryDatetime() {
        return entryDatetime;
    }

    public void setEntryDatetime(int entryDatetime) {
        this.entryDatetime = entryDatetime;
    }


}
