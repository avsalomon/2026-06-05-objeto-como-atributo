package org.example.app
import org.example.app.Fecha

class Persona (
private var nombre: String,
private var apellido: String,
private var fecha: Fecha) {
    override fun toString():String {
        return "Hola mi nombre es $nombre, mi apellido es $apellido, y naci el $fecha"
    }
}



