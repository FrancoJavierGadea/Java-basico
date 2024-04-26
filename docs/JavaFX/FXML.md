# FXML

En `FXML` cada elemento puede representar:

- La instancia de una `Clase`
- Una propiedad de una instancia de una `Clase`
- Una propiedad estatica
- Un bloque
- Un Script

<br>



## Controller

#### Indicando la Controller en el `fxml`

Se indica la `Clase` del **Controller** en el elemento root del `fxml` usando el atributo: `fx:controller`

```xml
<?xml version="1.0" encoding="UTF-8"?>

<?import javafx.scene.layout.VBox?>

<VBox xmlns:fx="http://javafx.com/fxml" fx:controller="JavaFX.Example2.MainController">

</VBox>
```
<br>

#### Indicando en Controller en el `java`

Creamos una instancia de la `Clase` **Controller** y se la pasamos al `FXMLLoader` antes de ejecutar `load`

```java
//Load FXML
FXMLLoader loader = new FXMLLoader(
    getClass().getResource("main.fxml")
);

MainController controller = new MainController();

loader.setController(controller);

VBox root = loader.load();
```

<br>

#### Obteniendo la instancia del Controller

Luego de que se haya ejecutado `load`
```java
VBox root = loader.load();

MainController controller = loader.getController();
```
<br>


#### Docs

- [Introduction to FXML](https://openjfx.io/javadoc/22/javafx.fxml/javafx/fxml/doc-files/introduction_to_fxml.html)