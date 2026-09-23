import menus from "@/data/menu-detail.json"

// 전체 메뉴 데이터 조회
export function getMenuList() {
    return menus;
}

// menuCode로 메뉴 하나 조회
export function getMenubyMenuCode(menuCode) {
    /**
     * 경로 파라미터로 menuCode를 전달받는다.
     * URL에서 읽어온 값은 문자열이므로 숫자로 변환해서 비교한다.
     * 
     * find: 조건에 맞는 첫 번째 요소 한 개를 반환
     */
    return menus.find(menu => menu.menuCode === Number(menuCode));
}

// 메뉴명을 전달받아 메뉴 이름을 포함하고 있는 메뉴 목록 조회
export function searchMenu(searchMenuName) {

    // includes() : 문자열에 검색어가 포함되어 있는지 true/false로 반환
    return menus.filter(menu => menu.menuName.includes(searchMenuName))
}
