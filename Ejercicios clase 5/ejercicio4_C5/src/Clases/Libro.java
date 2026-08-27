    package Clases;

    public class Libro {
        private int id;
        private static int contadorId;
        private String titulo;
        private String autor;
        private double precio;
        private int cantidadCopiasDisponible;

        public Libro() {
            contadorId++;
            id = contadorId;
        }

        public Libro(String titulo, String autor, double precio, int cantidadCopiasDisponible) {
            contadorId++;
            id = contadorId;
            this.titulo = titulo;
            this.autor = autor;
            this.precio = precio;
            this.cantidadCopiasDisponible = cantidadCopiasDisponible;
        }

        public int getId() {
            return id;
        }

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public String getAutor() {
            return autor;
        }

        public void setAutor(String autor) {
            this.autor = autor;
        }

        public double getPrecio() {
            return precio;
        }

        public void setPrecio(double precio) {
            this.precio = precio;
        }

        public int getCantidadCopiasDisponible() {
            return cantidadCopiasDisponible;
        }

        public void setCantidadCopiasDisponible(int cantidadCopiasDisponible) {
            this.cantidadCopiasDisponible = cantidadCopiasDisponible;
        }

        public boolean venderCopias(int cantidadVenta){
            if(cantidadVenta > 0 && this.cantidadCopiasDisponible >= cantidadVenta){
                cantidadCopiasDisponible -= cantidadVenta;
                return true;
            }else{
                return false;
            }
        }

        public void agregarCopias(int cantidad) {
            this.cantidadCopiasDisponible += cantidad;
        }

        @Override
        public String toString() {
            return "Libro[id=" + this.id + ", " +
                    "titulo=" + this.titulo + ", " +
                    "autor=" + this.autor + ", " +
                    "precio=" + this.precio + ", " +
                    "copias disponibles=" + this.cantidadCopiasDisponible +
                    "]";
        }
    }
