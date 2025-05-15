package com.example.zooapp.models
import com.example.zooapp.R

data class Animal (
    val id: Int,
    val name: String,
    val species: String,
    val imageRes: Int,
    val description: String,
    val curiosities: String,
    var isFavorite: Boolean = false
)

val animalList = listOf(
    Animal(
        id = 1,
        name = "Bulbasaur",
        species = "0001",
        imageRes = R.drawable.bulba,
        description = "Semente",
        curiosities = "Por algum tempo após o nascimento, ele usa os nutrientes contidos na semente em suas costas para crescer."
    ),
    Animal(
        id = 2,
        name = "Ivysaur",
        species = "0002",
        imageRes = R.drawable.ivy,
        description = "Semente",
        curiosities = "Quanto mais luz do sol Ivysaur recebe, mais força brota dentro dele, permitindo que o broto em suas costas cresça mais."
    ),
    Animal(
        id = 3,
        name = "Venusaur",
        species = "0003",
        imageRes = R.drawable.veno,
        description = "Semente",
        curiosities = "Enquanto se aquece ao sol, ele consegue converter a luz em energia, o que o torna mais potente no verão."
    ),
    Animal(
        id = 4,
        name = "Charmander",
        species = "0004",
        imageRes = R.drawable.charmander,
        description = "Fogo",
        curiosities = "A chama em sua cauda demonstra a força de sua força vital. Se Charmander estiver fraco, a chama também queimará fracamente."
    ),
    Animal(
        id = 5,
        name = "Charmeleon",
        species = "0005",
        imageRes = R.drawable.charmeleon,
        description = "Fogo",
        curiosities = "Quando ele balança sua cauda em chamas, a temperatura ao redor dele sobe cada vez mais, atormentando seus oponentes."
    ),
    Animal(
        id = 6,
        name = "Charizard ",
        species = "0006",
        imageRes = R.drawable.charizard,
        description = "Fogo",
        curiosities = "Se Charizard ficar realmente irritado, a chama na ponta de sua cauda queima em um tom azul claro."
    ),
    Animal(
        id = 7,
        name = "Squirtle ",
        species = "0007",
        imageRes = R.drawable.squirtle,
        description = "Água",
        curiosities = "Após o nascimento, suas costas incham e endurecem, formando uma concha. Ele exala uma espuma potente pela boca."
    ),
    Animal(
        id = 8,
        name = "Wartortle ",
        species = "0008",
        imageRes = R.drawable.war,
        description = "Água",
        curiosities = "A cauda longa e peluda de Wartortle é um símbolo de longevidade, por isso esse Pokémon é bastante popular entre pessoas mais velhas."
    ),
    Animal(
        id = 9,
        name = "Blastoise  ",
        species = "0009",
        imageRes = R.drawable.blast,
        description = "Água",
        curiosities = "Ele aumenta deliberadamente o peso do seu corpo para poder suportar o recuo dos jatos de água que dispara."
    )
)