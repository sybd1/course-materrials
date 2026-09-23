import Link from "next/link"
import itemStyle from "./MenuItem.module.css"

export default function MenuItem({ menu }) {
    return (
        <Link href={`/menu/${menu.menuCode}`}>
            <div className={itemStyle.MenuItem}>
                <h3>메뉴 이름: {menu.menuName}</h3>
                <h3>메뉴 가격: {menu.menuPrice}</h3>
                <h3>메뉴 종류: {menu.categoryName}</h3>
            </div>
        </Link>
    )
}