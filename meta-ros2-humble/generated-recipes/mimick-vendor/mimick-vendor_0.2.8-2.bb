# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "Wrapper around mimick, it provides an ExternalProject build of mimick."
AUTHOR = "Geoffrey Biggs <geoff@openrobotics.org>"
ROS_AUTHOR = "Jorge J. Perez <jjperez@ekumenlabs.com>"
HOMEPAGE = "https://github.com/Snaipe/Mimick"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0 & MIT"
LICENSE = "Apache-2.0 & MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=f12ef8c0445c08084ae92cf2dcb7ee92"

ROS_CN = "mimick_vendor"
ROS_BPN = "mimick_vendor"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    git-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = ""

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/mimick_vendor-release/archive/release/humble/mimick_vendor/0.2.8-2.tar.gz
ROS_BRANCH ?= "branch=release/humble/mimick_vendor"
SRC_URI = "git://github.com/ros2-gbp/mimick_vendor-release;${ROS_BRANCH};protocol=https"
SRCREV = "c2c7cccbfa6551d7fc2bc10a126313e45c963c0b"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
