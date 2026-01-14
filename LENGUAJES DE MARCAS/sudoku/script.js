const grid = document.getElementById('grid');
let selectedCell = null;

// Crear el tablero
for (let i = 0; i < 81; i++) {
    const cell = document.createElement('button');
    cell.classList.add('cell');
    cell.addEventListener('click', () => {
        if (selectedCell) selectedCell.classList.remove('selected');
        selectedCell = cell;
        cell.classList.add('selected');
    });
    grid.appendChild(cell);
}

// Poner número en la celda seleccionada
function setNumber(num) {
    if (selectedCell) {
        selectedCell.textContent = num === 0 ? "" : num;
        selectedCell.style.color = "#0056b3"; // Color distinto para los números manuales
    }
}

// Obtener matriz del tablero
function getBoard() {
    const cells = document.querySelectorAll('.cell');
    let board = [];
    for (let i = 0; i < 9; i++) {
        let row = [];
        for (let j = 0; j < 9; j++) {
            const val = cells[i * 9 + j].textContent;
            row.push(val === "" ? 0 : parseInt(val));
        }
        board.push(row);
    }
    return board;
}

// Algoritmo Backtracking
function solveSudoku() {
    let board = getBoard();
    if (solve(board)) {
        updateGrid(board);
    } else {
        alert("No tiene solución");
    }
}

function solve(board) {
    for (let r = 0; r < 9; r++) {
        for (let c = 0; c < 9; c++) {
            if (board[r][c] === 0) {
                for (let n = 1; n <= 9; n++) {
                    if (isValid(board, r, c, n)) {
                        board[r][c] = n;
                        if (solve(board)) return true;
                        board[r][c] = 0;
                    }
                }
                return false;
            }
        }
    }
    return true;
}

function isValid(board, r, c, n) {
    for (let i = 0; i < 9; i++) {
        if (board[r][i] === n || board[i][c] === n) return false;
        const blockR = 3 * Math.floor(r / 3) + Math.floor(i / 3);
        const blockC = 3 * Math.floor(c / 3) + (i % 3);
        if (board[blockR][blockC] === n) return false;
    }
    return true;
}

function updateGrid(board) {
    const cells = document.querySelectorAll('.cell');
    for (let i = 0; i < 81; i++) {
        const r = Math.floor(i / 9);
        const c = i % 9;
        if (cells[i].textContent === "") {
            cells[i].textContent = board[r][c];
            cells[i].style.color = "#333";
        }
    }
}

function clearBoard() {
    const cells = document.querySelectorAll('.cell');
    cells.forEach(c => {
        c.textContent = "";
        c.style.color = "#333";
    });
}