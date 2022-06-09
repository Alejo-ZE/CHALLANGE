package com.quizgame.config;

import com.quizgame.category.Category;
import com.quizgame.category.LevelFiveCategory;
import com.quizgame.category.LevelFourCategory;
import com.quizgame.category.LevelOneCategory;
import com.quizgame.category.LevelThreeCategory;
import com.quizgame.category.LevelTwoCategory;
import com.quizgame.question.Answer;
import com.quizgame.question.Question;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Config {

    public static Map<Integer, Category> getQuestions() {
        return runQuesions();
    }

    private static Map<Integer, Category> runQuesions() {
        //GEOGRAFIA
        List<Answer> answers1 = new ArrayList<>();
        answers1.add(new Answer(false, "Colombia"));
        answers1.add(new Answer(false, "Venezuela"));
        answers1.add(new Answer(false, "Argentina"));
        answers1.add(new Answer(true, "España"));
        Question question1 = new Question("de los siguientes, cual no es un pais?", answers1);

        List<Answer> answers2 = new ArrayList<>();
        answers2.add(new Answer(false, "Albania"));
        answers2.add(new Answer(true, "Berlín"));
        answers2.add(new Answer(false, "Malasia"));
        answers2.add(new Answer(false, "Suecia"));
        Question question2 = new Question("de los siguientes, cual no es un pais?", answers2);

        List<Answer> answers3 = new ArrayList<>();
        answers3.add(new Answer(false, "Cancun"));
        answers3.add(new Answer(false, "Paris"));
        answers3.add(new Answer(false, "Londres"));
        answers3.add(new Answer(true,  "Chipre"));
        Question question3 = new Question("de las siguientes, cual no es una ciudad?", answers3);

        List<Answer> answers4 = new ArrayList<>();
        answers4.add(new Answer(false, "Tarawa"));
        answers4.add(new Answer(false, "Lisboa"));
        answers4.add(new Answer(true,  "Conakry"));
        answers4.add(new Answer(false, "Yaren"));
        Question question4 = new Question("Cual es la capital de Guinea ?", answers4);

        List<Answer> answers5 = new ArrayList<>();
        answers5.add(new Answer(true, "Egipto"));
        answers5.add(new Answer(false, "Europa"));
        answers5.add(new Answer(false, "América"));
        answers5.add(new Answer(false, "Asia"));
        Question question5 = new Question("de los siguientes, cual no es un continente?", answers5);


        //DEPORTES
        List<Answer> answers6 = new ArrayList<>();
        answers6.add(new Answer(true, "41.85 km"));
        answers6.add(new Answer(false, "42.16 km"));
        answers6.add(new Answer(false, "43.77 km"));
        answers6.add(new Answer(false, "43.45 km"));
        Question question6 = new Question("¿Cuántos Km de distancia mide una maratón?", answers6);

        List<Answer> answers7 = new ArrayList<>();
        answers7.add(new Answer(false, "Azul, rojo, amarillo, verde y negro"));
        answers7.add(new Answer(true, "Azul, rojo, amarillo, verde y violeta"));
        answers7.add(new Answer(false, "índigo, rojo, morado, verde y negro"));
        answers7.add(new Answer(false, "Azul, rojo, amarillo, naranja y verde"));
        Question question7 = new Question("¿Cuáles son los cinco colores del anillo de los Juegos Olímpicos?", answers7);


        List<Answer> answers8 = new ArrayList<>();
        answers8.add(new Answer(false, "2 minutos"));
        answers8.add(new Answer(false, "3 minutos"));
        answers8.add(new Answer(false, "4 minutos"));
        answers8.add(new Answer(true,  "5 minutos"));
        Question question8 = new Question("¿Cuánto dura un round típico de boxeo para hombres?", answers8);

        List<Answer> answers9 = new ArrayList<>();
        answers9.add(new Answer(false, "1 punto"));
        answers9.add(new Answer(false, "2 puntos"));
        answers9.add(new Answer(true,  "3 puntos"));
        answers9.add(new Answer(false, "4 puntos "));
        Question question9 = new Question("¿Cuántos puntos vale un tiro libre en baloncesto?", answers9);

        List<Answer> answers10 = new ArrayList<>();
        answers10.add(new Answer(false, "9 jugadores"));
        answers10.add(new Answer(false,"11 jugadorees"));
        answers10.add(new Answer(true,"10 jugadores"));
        answers10.add(new Answer(false,"8 jugadores"));
        Question question10 = new Question("¿Cuantos jugadores tiene un equipo de futbol?", answers10);


        //NETFLIX
        List<Answer> answers11 = new ArrayList<>();
        answers11.add(new Answer(true, "Christina Santos"));
        answers11.add(new Answer(false, "Salma Hayek"));
        answers11.add(new Answer(false, "Anahí Puente"));
        answers11.add(new Answer(false, "Jennifer Lopez"));
        Question question11 = new Question("En ‘Selena: la serie’, ¿quién interpreta a la cantante y protagonista, Selena?", answers11);

        List<Answer> answers12 = new ArrayList<>();
        answers12.add(new Answer(false, "Ralph Macchio"));
        answers12.add(new Answer(true, " Tom Ellis"));
        answers12.add(new Answer(false, "Charlie Cox"));
        answers12.add(new Answer(false, "Chris Evans"));
        Question question12 = new Question("‘Lucifer’ es protagonizada por…", answers12);

        List<Answer> answers13 = new ArrayList<>();
        answers13.add(new Answer(false, " Fisioterapeuta"));
        answers13.add(new Answer(false, "Corredora de seguros"));
        answers13.add(new Answer(false, "Trabajadora sexual"));
        answers13.add(new Answer(true,  " Terapeuta sexual"));
        Question question13 = new Question(" ¿Cuál es la profesión de la madre de Otis en la serie ‘Sex Education’??", answers13);

        List<Answer> answers14 = new ArrayList<>();
        answers14.add(new Answer(false, "Son protagonizadas por el mismo actor"));
        answers14.add(new Answer(false, " Son del mismo director"));
        answers14.add(new Answer(true,  "La trama comienza con la desaparición de un niño"));
        answers14.add(new Answer(false, " Alguien muere en el primer episodio"));
        Question question14 = new Question("¿Qué tienen en común las series ‘Stranger Things’ y ‘Dark’?", answers14);

        List<Answer> answers15 = new ArrayList<>();
        answers15.add(new Answer(false, "Sex Education"));
        answers15.add(new Answer(false,"Insatiable"));
        answers15.add(new Answer(true,"The Good Place"));
        answers15.add(new Answer(false,"Designated Survivor"));
        Question question15 = new Question("Esta serie fue creada por Michael Schur, creador de ‘The Office’ y protagonizada por Kristen Bell…", answers15);


        //VIAJES
        List<Answer> answers16 = new ArrayList<>();
        answers16.add(new Answer(true, "Un territorio británico de ultramar en el océano Atlántico"));
        answers16.add(new Answer(false, "Islas tropicales gobernadas por Francia en el Pacífico sur"));
        answers16.add(new Answer(false, "Un país independiente de habla inglesa frente a la costa de Belice"));
        answers16.add(new Answer(false, "Islas de Portugal en el archipiélago de las Azores"));
        Question question16 = new Question("¿Qué son las Turcas y Caicos?", answers16);

        List<Answer> answers17 = new ArrayList<>();
        answers17.add(new Answer(false, "Almejas geoduck"));
        answers17.add(new Answer(true, "Cioppino"));
        answers17.add(new Answer(false, "Ostras de las Montañas Rocosas"));
        answers17.add(new Answer(false, "Rollitos de pepperoni"));
        Question question17 = new Question("¿Cuál de estos alimentos icónicos está relacionado con San Francisco?", answers17);

        List<Answer> answers18 = new ArrayList<>();
        answers18.add(new Answer(false, "Peso"));
        answers18.add(new Answer(false, "Córdoba"));
        answers18.add(new Answer(false, "Dólar"));
        answers18.add(new Answer(true,  "Colón"));
        Question question18 = new Question("¿Cómo se llama la moneda utilizada en Costa Rica?", answers18);

        List<Answer> answers19 = new ArrayList<>();
        answers19.add(new Answer(false, "Iba a ser temporal y casi se destruyó en 1909"));
        answers19.add(new Answer(false, "Un grupo de destacados arquitectos y artistas protestaron contra su construcción y la llamaron “una torre vertiginosa y ridícula que domina París como una gigantesca chimenea negra”."));
        answers19.add(new Answer(true,  "Fue un regalo de Estados Unidos en 1889 a cambio de la Estatua de la Libertad"));
        answers19.add(new Answer(false, "Hay un bar de champán en la parte superior"));
        Question question19 = new Question("¿Qué afirmación sobre la Torre Eiffel no es cierta?", answers19);

        List<Answer> answers20 = new ArrayList<>();
        answers20.add(new Answer(false, "Los jugadores"));
        answers20.add(new Answer(false,"Las alturas"));
        answers20.add(new Answer(true,"Los prados"));
        answers20.add(new Answer(false,"Los manantiales"));
        Question question20 = new Question("¿Cuál de las siguientes es un sinónimo del nombre Las Vegas?", answers20);


        //ANIME
        List<Answer> answers21 = new ArrayList<>();
        answers21.add(new Answer(true, "sasuke"));
        answers21.add(new Answer(false, "goku"));
        answers21.add(new Answer(false, "naruto"));
        answers21.add(new Answer(false, "luffy"));
        Question question21 = new Question("¿Cual de estos hace el chidori?", answers21);

        List<Answer> answers22 = new ArrayList<>();
        answers22.add(new Answer(false, "minato"));
        answers22.add(new Answer(true, "naruto"));
        answers22.add(new Answer(false, "obito"));
        answers22.add(new Answer(false, "kakashi"));
        Question question22 = new Question("¿quien tiene el kyuubi encerrado?", answers22);

        List<Answer> answers23 = new ArrayList<>();
        answers23.add(new Answer(false, "hinata"));
        answers23.add(new Answer(false, "kakashi"));
        answers23.add(new Answer(false, "sakura"));
        answers23.add(new Answer(true,  "sasuke"));
        Question question23 = new Question("¿Con quien fue el primer beso de naruto?", answers23);

        List<Answer> answers24 = new ArrayList<>();
        answers24.add(new Answer(false, "creo que si"));
        answers24.add(new Answer(false, "si"));
        answers24.add(new Answer(true,  "no"));
        answers24.add(new Answer(false, "todas las anteriores"));
        Question question24 = new Question("¿karim es una uchiha?", answers24);

        List<Answer> answers25 = new ArrayList<>();
        answers25.add(new Answer(false, "mister satan"));
        answers25.add(new Answer(false,"vegueta"));
        answers25.add(new Answer(true,"gohan"));
        answers25.add(new Answer(false,"bills"));
        Question question25 = new Question("¿Como se llama el hijo de goku?", answers25);

        List<Question> questionListLevelOne = new ArrayList<>(List.of(question1, question2, question3, question4, question5));
        List<Question> questionListLevelTwo = new ArrayList<>(List.of(question6, question7, question8, question9, question10));
        List<Question> questionListLevelThere = new ArrayList<>(List.of(question11, question12, question13, question14, question15));
        List<Question> questionListLevelFour = new ArrayList<>(List.of(question16, question17, question18, question19, question20));
        List<Question> questionListLevelFive = new ArrayList<>(List.of(question21, question22, question23, question24, question25));

        Category levelOneCategory = new LevelOneCategory(questionListLevelOne);
        Category levelTwoCategory = new LevelTwoCategory(questionListLevelTwo);
        Category levelThreeCategory = new LevelThreeCategory(questionListLevelThere);
        Category levelFourCategory = new LevelFourCategory(questionListLevelFour);
        Category levelFiveCategory = new LevelFiveCategory(questionListLevelFive);

        Map<Integer, Category> categoryMap = new HashMap<>();
        categoryMap.put(levelOneCategory.getLevel(), levelOneCategory);
        categoryMap.put(levelTwoCategory.getLevel(), levelTwoCategory);
        categoryMap.put(levelThreeCategory.getLevel(), levelThreeCategory);
        categoryMap.put(levelFourCategory.getLevel(), levelFourCategory);
        categoryMap.put(levelFiveCategory.getLevel(), levelFiveCategory);

        return categoryMap;
    }
}
