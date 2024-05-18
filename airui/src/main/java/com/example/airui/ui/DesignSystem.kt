package com.example.airui.ui

/*class DesignSystemProviderProtocol {
    // Define properties and methods for DesignSystemProviderProtocol

}*/


interface ComponentConfig {

}

interface DesignSystemProviderProtocol {
    val componentConfig: ComponentConfig
}
class DesignSystem(
    private var breakpoint: Breakpoint = Breakpoint.EXTRA_SMALL,
    private var providerExtraSmall: DesignSystemProviderProtocol,
    private var providerSmall: DesignSystemProviderProtocol,
    private var providerMedium: DesignSystemProviderProtocol,
    private var providerLarge: DesignSystemProviderProtocol
) {

    val provider: DesignSystemProviderProtocol
        get() {
            return when (breakpoint) {
                Breakpoint.EXTRA_SMALL -> providerExtraSmall
                Breakpoint.SMALL -> providerSmall
                Breakpoint.MEDIUM -> providerMedium
                Breakpoint.LARGE -> providerLarge
            }
        }

}