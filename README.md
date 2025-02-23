Sistema Solar - Aplicación Android

Descripción

La aplicación "Sistema Solar" es una app educativa desarrollada en Android Studio que permite a los usuarios explorar planetas del sistema solar. En la pantalla principal, se muestra una imagen del sistema solar con botones invisibles sobre cada planeta. Al hacer clic en la imagen, los botones de cada planeta se hacen visibles y permiten navegar a una actividad específica del planeta seleccionado.

Cada actividad de planeta tiene:

Un fondo de pantalla representativo del planeta.

Un botón de regreso a la pantalla principal.

Manejo de Transiciones entre Actividades

Las transiciones entre actividades se manejan utilizando Intent en Kotlin. Cuando un usuario selecciona un planeta, se inicia una nueva Activity correspondiente mediante:

val intent = Intent(this, VenusActivity::class.java)
startActivity(intent)

Para regresar a la pantalla principal desde cualquier actividad de planeta, se implementó un botón backButton, que al presionarse inicia MainActivity y finaliza la actividad actual:

val backButton: Button = findViewById(R.id.backButton)
backButton.setOnClickListener {
    val intent = Intent(this, MainActivity::class.java)
    startActivity(intent)
    finish()
}

Esto asegura que la memoria se maneje eficientemente y evita la acumulación de actividades en la pila.

Instrucciones para Ejecutar y Probar la Aplicación

Clonar el repositorio o descargar los archivos del proyecto.

Abrir Android Studio y seleccionar "Open an Existing Project".

Verificar que los archivos XML y Kotlin estén correctamente configurados.

Ejecutar la aplicación en un dispositivo físico o en un emulador:

Conectar un dispositivo Android con "Depuración USB" habilitada o iniciar un emulador.

Hacer clic en el botón "Run" en Android Studio.

Prueba de funcionalidades:

En la pantalla principal, hacer clic en la imagen del sistema solar para visualizar los botones.

Seleccionar un planeta y verificar que se abre su actividad correspondiente.

En cada actividad, presionar el botón de regreso para asegurarse de que retorna a la pantalla principal correctamente.
