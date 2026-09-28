import GrandChild from "./GrandChild";

export default function Child({ count, setCount }) {
    return (
        <>
            <h2>Child 컴포넌트</h2>
            <GrandChild count={count} setCount={setCount} />
        </>
    )
}