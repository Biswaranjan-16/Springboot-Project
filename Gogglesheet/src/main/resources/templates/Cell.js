import React from "react";
function Cell({ id, value, onChange }) {
    return <input value={value} onChange={(e) => onChange(id, e.target.value)} />;
}
export default Cell;