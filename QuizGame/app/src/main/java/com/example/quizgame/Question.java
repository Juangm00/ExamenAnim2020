package com.example.quizgame;

public class Question extends MainActivity{
    String Pregunta;
    boolean Respuesta;

    Question(String Pregunta,boolean Respuesta){
        this.Pregunta= Pregunta;
        this.Respuesta= Respuesta;
    }

    public Question(boolean respuesta) {
        Respuesta = respuesta;
    }

    public Question(String pregunta) {
        Pregunta = pregunta;
    }



    public String getPregunta() {
        return Pregunta;
    }

    public void setPregunta(String pregunta) {
        Pregunta = pregunta;
    }

    public boolean isRespuesta() {
        return Respuesta;
    }

    public void setRespuesta(boolean respuesta) {
        Respuesta = respuesta;
    }
}
