import React, { useState } from "react";
import Cell from "./Cell";
function Sheet() {
    const [cells, setCells] = useState({});
    const updateCell = (id, value) => {
        setCells({ ...cells, [id]: value });
    };
    return (
        <div>
            {[...Array(5)].map((_, row) => (
                <div key={row}>
                    {[...Array(5)].map((_, col) => (
                        <Cell key={`${row}-${col}`} id={`${row}-${col}`} value={cells[`${row}-${col}`] || ""} onChange={updateCell} />
                    ))}
                </div>
            ))}
        </div>
    );
}
export default Sheet;