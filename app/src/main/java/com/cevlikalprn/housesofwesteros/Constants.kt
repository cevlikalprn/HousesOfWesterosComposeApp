package com.cevlikalprn.housesofwesteros

import java.util.ArrayList

object Constants {

    val houseList: ArrayList<HousesOfWesteros> = arrayListOf(

        HousesOfWesteros(
            houseId = 0,
            houseName = "Stark",
            houseWords = "Winter is Coming",
            housePicture = "https://lh3.googleusercontent.com/proxy/TgESEnD2PiDahamT_lksb4Om9Ow0ecv5bLZBwiBqw5EZVfjpqO5X1B6376cdZBkrIExPz2yeoxNThZS76ehuW7NjwtthkfGm8IZ9q5be0tjnbz9c",
            houseHistory =
                "rulers of the North from the castle of Winterfell and the royal house of the independent Kingdom of the North." +
                        " Retook their lands from House Bolton, who usurped House Stark at the Red Wedding, after the Battle of the Bastards." +
                        " The house is ruled by Sansa Stark, the Queen in the North. The heir is Princess Arya Stark."
        ),
        HousesOfWesteros(
            houseId = 1,
            houseName = "Arryn",
            houseWords = "As High as Honor",
            housePicture = "https://vignette.wikia.nocookie.net/gameofthrones/images/6/62/House-Arryn-Square.PNG/revision/latest?cb=20170512000629",
            houseHistory ="rulers of the Vale of Arryn from the castle of the Eyrie. " +
                    "It was integrated with the Kingdom of the North until King Jon Snow abdicated. " +
                    "Its current head is Lord Robin Arryn, who is also the only current member."
        ),
        HousesOfWesteros(
            houseId = 2,
            houseName = "Baratheon",
            houseWords = "Ours is the Fury",
            housePicture = "https://seeklogo.com/images/H/house-baratheon-logo-5CCDDDEE04-seeklogo.com.png",
            houseHistory ="rulers of the Stormlands from the castle of Storm's End." +
                    " The former royal house of the Seven Kingdoms after Robert's Rebellion." +
                    " The bloodline went extinct after Stannis Baratheon was killed at the Battle of Winterfell." +
                    " Legally went extinct when King Tommen Baratheon killed himself in King's Landing after the destruction of the Great Sept of Baelor. " +
                    "Restored when Queen Daenerys Targaryen legitimized Robert's unacknowledged bastard son Gendry Baratheon."
        ),
        HousesOfWesteros(
            houseId = 3,
            houseName = "Tully",
            houseWords = "Family, Duty, Honor",
            housePicture = "https://seeklogo.com/images/H/house-tully-logo-A8FBC1C41D-seeklogo.com.png",
            houseHistory ="rulers of the Riverlands from their seat at Riverrun." +
                    " Riverrun was under Frey and Lannister control until Daenerys Targaryen overthrew Queen Cersei Lannister in the Battle of King's Landing." +
                    " Lord Edmure Tully was restored to his former positions sometime after Arya Stark assassinated all the males of House Frey."
        ),
        HousesOfWesteros(
            houseId = 4,
            houseName = "Greyjoy",
            houseWords = "We Do Not Sow",
            housePicture = "https://lh3.googleusercontent.com/proxy/gvvYIchrCmDGqLBt0eyjqVFgIx80NNvkPHynDkiEJjeeaERZJXgDCvhIyxFHZbZUUipn1RFYBa75BrtrAz32v6rmBGWZI-UCYxoScGf6hpzSfKdNHxU",
            houseHistory ="rulers of the Iron Islands from the castle of Pyke. " +
                    "Its leadership was disputed by King Euron Greyjoy and claimant Queen Yara Greyjoy. " +
                    "However, following the Battle of King's Landing, and with Euron's death at the hands of Ser Jaime Lannister, " +
                    "Yara is now the head of the house."
        ),
        HousesOfWesteros(
            houseId = 5,
            houseName = "Lannister",
            houseWords = "Hear Me Roar!",
            housePicture = "https://seeklogo.com/images/L/lannister-logo-7DC5E5A0B5-seeklogo.com.png",
            houseHistory ="rulers of the Westerlands from the castle of Casterly Rock. " +
                    "The former royal house of the Seven Kingdoms after the destruction of the Great Sept of Baelor until the Battle of King's Landing. " +
                    "Its leadership was disputed by Queen Cersei I Lannister and Hand of the Queen to Daenerys Targaryen," +
                    " Lord Tyrion Lannister, who became the head of House Lannister after the Battle of King's Landing."
        ),
        HousesOfWesteros(
            houseId = 6,
            houseName = "Tyrell",
            houseWords = "Growing Strong",
            housePicture = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcToWVkgHIetjsUcayxoPP520LXz44ZLNtwwOw&usqp=CAU",
            houseHistory ="rulers of the Reach from the castle of Highgarden after the extinction of House Gardener. " +
                    "The bloodline is wiped out as a result of the destruction of the Great Sept of Baelor and the Sack of Highgarden."
        ),HousesOfWesteros(
            houseId = 7,
            houseName = "Martell",
            houseWords = "Unbowed, Unbent, Unbroken",
            housePicture = "https://seeklogo.com/images/H/house-martell-logo-7CAF1ACA88-seeklogo.com.png",
            houseHistory ="rulers of Dorne from the castle of Sunspear." +
                    " Deposed by Ellaria Sand and three of the Sand Snakes in their coup." +
                    " An unnamed Martell retook control over Dorne after Ellaria's defeat."
        ),
        HousesOfWesteros(
            houseId = 8,
            houseName = "Targaryen",
            houseWords = "Fire and Blood",
            housePicture = "https://i.redd.it/okqzzsr1baz21.jpg",
            houseHistory ="the former royal house of the Seven Kingdoms since the War of Conquest. Overthrown in Robert's Rebellion, but restored following the Battle of King's Landing." +
                    " After Jon Snow rejoined the Night's Watch, House Targaryen became legally extinct. " +
                    "The bloodline of House Targaryen lives in House Baratheon and House Martell."
        )

    )

}