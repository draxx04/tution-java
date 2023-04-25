//In a town,the percentage of men is 52. 
//The percentage of total literacy is 48. 
//If total percentage of literate men is 35 of the total population.
//Find the total number of illiterate men and women if the population of the town is 80,000.

//given
// % of men = 52
// % of total literacy rate = 48
// % of literate men = 35
// total population = 80000

class percentage_cal {
    public static void main(String[] args) {
        double total_literacy_rate = 48; // % of total literacy rate
        double total_literate_men = 35; // 35%
        double total_illiterate_rate = 100 - total_literacy_rate; // 100% - 48% = 52%
        double total_population = 80000;
        double total_illiteracy_rate_of_men_women = (total_population * total_illiterate_rate) / 100; // 80000*52%
        double total_illiterate_men = (total_illiteracy_rate_of_men_women * total_literate_men) / 100; // 41600 * 35/100
        double total_illiterate_women = total_illiteracy_rate_of_men_women - total_illiterate_men;
        System.out.println("total illiterate men : " + total_illiterate_men);
        System.out.println("total illiterate women :" + total_illiterate_women);
        System.out.println(" The total of illiterate men and women are : " + total_illiteracy_rate_of_men_women);

    }
}