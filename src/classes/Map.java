package classes;
import java.util.Scanner;

/* Classe qui génère une grille de jeu par utilisateur.
 * Attributs :
 *  - id un attribut unique
 *  - username le nom du joueur
 *  - gameGrid la grille de jeu
 *      -> 0 si rien sur la case
 *      -> 1 si c'est une route
 *      -> ...
 */
public class Map {
    
    private String idUser;
    private String username;
    private int[][] gameGrid;

    /* Getters et setters */
    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int[][] getGameGrid() {
        return gameGrid;
    }

    public void setGameGrid(int[][] gameGrid) {
        this.gameGrid = gameGrid;
    }

    /* Initialisation d'une grille de jeu.
     * On remplit la grille à 0 car aucun objet n'est placé sur la map.
     * Pour l'instant, on admet qu'une grille est carrée.
     */
    public Map(String id, String user, int defaultWidth) {
        this.idUser = id;
        this.username = user;
        this.gameGrid = new int[defaultWidth][defaultWidth];
        for(int i = 0; i < this.gameGrid.length; i++) {
            for(int j = 0; j < this.gameGrid[i].length; j++) {
                this.gameGrid[i][j] = 0;
            }
        }
    }

    public Map(String id, String user, int[][] grid) {
        this.idUser = id;
        this.username = user;
        this.gameGrid = grid;
    }

    /* Affiche la grille de jeu dans la console */
    public void afficheGrille() {
        System.out.println("Map of "+getUsername()+" :");
        System.out.println();
        for(int i = 0; i < getGameGrid().length; i++) {
            if(i < 10) System.out.print(i + "  ");
            else System.out.print(i + " ");
            for(int j = 0; j < getGameGrid()[i].length; j++) {
                System.out.print("| "+getGameGrid()[i][j]+" ");
            }
            System.out.print("| ");
            System.out.println();
        }
        System.out.println();
    }

    /* Système de parcelles. On veut agrandir une grille sans modifier
     * l'état de la grille actuelle.
    */
    public void agranditGrille() {
    }
}
