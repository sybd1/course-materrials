export default function GrandChild({ count, setCount }) {
    return (
        <>
            <h2>GrandChild count: {count}</h2>
            <button onClick={() => setCount(count + 1)}>+1</button>
        </>
    )
}