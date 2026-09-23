export default function DashboardLayout({children}) {
    return (
        <>
            <h2>대시보드 메뉴</h2>
            <ul>
                <li>통계</li>
                <li>사용자</li>
                <li>설정</li>
            </ul>
            {children} {/* 여기에 dashboard/page.js가 렌더링 */}
        </>
    )
}