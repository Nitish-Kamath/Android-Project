package com.harleenkaur.carShop

object setData {

    fun setTourData(): List<userDefinedData> {
        var carList = mutableListOf<userDefinedData>()
        carList.add(
            userDefinedData(
                "Hyundi",
                "Hyundai i20",
                "4.4",
                "v4 engine",
                "2000",
                "4 doors",
                "7.19 lakh -  11.33 lakh",
                "Red Color",
                "10/11/2009",

                )
        )
        carList.add(
            userDefinedData(
                "Maruti",
                "Maruti Alto K10",
                "4.6",
                "v4 engine",
                "2010",
                "5 doors",
                "3.99 lakh - 5.99 lakh",
                "Red Color",
                "12/12/2012",

                )
        )
        carList.add(
            userDefinedData(
                "Mercedes",
                "Mercedes-Benz GLE",
                "4.8",
                "v6 engine",
                "2020",
                "5 doors",
                "87.91 lakh - 1.05 crore",
                "Red Color",
                "02/01/2020",

                )
        )
        carList.add(
            userDefinedData(
                "Tata",
                "Tata Punch",
                "4.1",
                "v4 engine",
                "2021",
                "4 doors",
                "5.49 lakh - 9.4 lakh",
                "Blue Color",
                "12/10/2023",

                )
        )
        carList.add(
            userDefinedData(
                "Renault",
                "Renault Kiger RXL",
                "4.6",
                "v4 engine",
                "2021",
                "4 doors",
                "7.92 lakh - 9 lakh",
                "White Color",
                "10/02/2022",

                )
        )
        carList.add(
            userDefinedData(
                "Mahindra",
                "Mahindra Thar",
                "4.3",
                "v4 engine",
                "1970",
                "3 doors",
                "9.99 lakh - 16.49 lakh",
                "Red Color",
                "10/03/2000",

                )
        )
        carList.add(
            userDefinedData(
                "Tiago",
                "Tata Tiago Ev",
                "4.3",
                "v4 engine",
                "2023",
                "5 doors",
                "5.54 lakh - 8.00 lakh",
                "Nave Blue Color",
                "21/03/2023",

                )
        )
        carList.add(
            userDefinedData(
                "Toyota",
                "Toyota Fortuner",
                "4.1",
                "v4 engine",
                "2005",
                "4 doors",
                "32.59 lakh - 50.34 lakh",
                "Black Color",
                "03/01/2008",

                )
        )


        carList.add(
            userDefinedData(
                "Volkswagen",
                "Volkswagen Virtus",
                "4.7",
                "v6 engine",
                "2022",
                "5 doors",
                "11.48 lakh - 18.57 lakh",
                "Red Tint Color",
                "09/03/2023",

                )
        )
        carList.add(
            userDefinedData(
                "Maruti",
                "Maruti Baleno",
                "4,3",
                "v4 engine",
                "2016",
                "5 doors",
                "6.56 lakh - 9.83 lakh",
                "Brown Color",
                "07/10/2018",

                )
        )
        return carList
    }

}