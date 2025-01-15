package classes;

/* Classe qui génère une grille de jeu par utilisateur.
 * Attributs :
 *  - id un attribut unique
 *  - username le nom du joueur
 *  - gameGrid la grille de jeu
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
        for(int i = 0; i < getGameGrid().length; i++) {
            for(int j = 0; j < getGameGrid()[i].length; j++) {
                System.out.print("| "+getGameGrid()[i][j]+" ");
            }
            System.out.print("| ");
            System.out.println();
        }
    }

    /* Agrandit la grille de jeu */
    public void agranditGrille(int width) {
        int[][] newGrille = new int[getGameGrid().length + width][getGameGrid().length + width];
        for(int i = 0; i < newGrille.length; i++) {
            for(int j = 0; j < newGrille[i].length; j++) {
                if(i < getGameGrid().length && j < getGameGrid().length) newGrille[i][j] = getGameGrid()[i][j];
                else newGrille[i][j] = 0;
            }
        }
        setGameGrid(newGrille);
    }
}
