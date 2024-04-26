

## FlowLayout - [class](https://docs.oracle.com/javase/8/docs/api/java/awt/FlowLayout.html)

Es el layout por defecto de cada `JPanel`

Es como `CSS Flex`, pero solo **Horizontal**, con el `gap` entre elementos y el `padding` con el mismo valor y con `flex-wrap: wrap`

#### Horizontal and Vertical gap - `padding` `gap`: 

Espacio entre los componentes y los bordes del contenedor

- `setHgap(int gap)` por defecto: `5` 
- `setVgap(int gap)` por defecto: `5`

#### Horizontal Align - `justify-content`

`setAlignment(int aling)` por defecto: `FlowLayout.CENTER`

Valores para la alineacion
```java
FlowLayout.LEFT
FlowLayout.RIGHT
FlowLayout.CENTER
FlowLayout.LEADING
FlowLayout.TRAILING
```

<br>


## BorderLayout - [class](https://docs.oracle.com/javase/8/docs/api/java/awt/BorderLayout.html)

Es el layout por defecto de cada `JFrame`

Define 5 **areas** indicadas por las constantes:

- `BorderLayout.PAGE_START`
- `BorderLayout.PAGE_END`
- `BorderLayout.LINE_START`
- `BorderLayout.LINE_END`
- `BorderLayout.CENTER`

#### Horizontal and Vertical gap - `gap`: 

Espacio entre las areas

#### Mirar: 

[How to Use BorderLayout](https://docs.oracle.com/javase%2Ftutorial%2Fuiswing%2F%2F/layout/border.html)

<br>



#### Docs

- [Uso de Layouts](https://chuidiang.org/index.php?title=Uso_de_Layouts)